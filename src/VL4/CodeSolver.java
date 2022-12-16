package VL4;

public class CodeSolver {
    public static String key = generateKey();

    public static void main(String[] args){

        for(int i = 0; i < 511; i++){
            String binNum = String.format("%" + 9 + "s",
                    Integer.toBinaryString(i)).replaceAll(" ", "0");
            if(isCorrect(binNum)) {
                System.out.println("The Key was: " + key);
                System.out.println("The found Key is: " + binNum);
                break;
            }
        }
    }

    public static boolean isCorrect(String guess){
        return key.equals(guess);
    }

    public static String generateKey(){
        String key = "";
        for(int i = 0; i < 9; i++) {
            if(Math.random() > 0.5){
                key += "1";
            } else {
                key += "0";
            }
        }
        return key;
    }
}
