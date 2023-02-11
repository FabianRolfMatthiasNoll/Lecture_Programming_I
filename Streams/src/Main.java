import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RandomWordsReader rwr = new RandomWordsReader();
        LineBreakAdder lba = new LineBreakAdder(rwr);

        Aufgabe2 a2 = new Aufgabe2(lba);
        try {
            int size = 500;
            char[] out = new char[size];
            a2.read(out, 0, size);

            System.out.println(out);

            a2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}