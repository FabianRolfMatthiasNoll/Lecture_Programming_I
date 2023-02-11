import java.io.*;

public class FileSplit {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        long maxSize = 1444000; // 1,44 MB in bytes
        int parts = (int) Math.ceil(file.length() / (double) maxSize);

        FileInputStream fis = new FileInputStream(file);
        for (int i = 1; i <= parts; i++) {
            String newFileName = file.getName() + "." + i;
            FileOutputStream fos = new FileOutputStream(newFileName);
            byte[] buffer = new byte[(int) maxSize];
            int read = fis.read(buffer);
            if (read == -1) {
                break;
            }
            fos.write(buffer, 0, read);
        }
    }
}