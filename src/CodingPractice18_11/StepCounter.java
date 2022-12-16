import java.lang.*;

public class StepCounter {

    public static int countSteps(int stairs){
        //initializing array for possible combinations
        int[] res = new int[stairs + 1];
        //initializing "first 3" special steps
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

        for (int i = 2; i <= stairs; i++){
            res[i] = res[i - 1] + res[i - 2];
        }

        return res[stairs];
    }

    public static int stairBin(int stairs){ //Formel von Binä...
        stairs++;
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5)/2;
        int nthTerm = (int)((Math.pow(phi,stairs) - Math.pow(-phi,-stairs))/squareRootOf5);
        return nthTerm;
    }

    public static void main(String args[]){
        int stairs = 6;
        System.out.println(countSteps(stairs));
        System.out.println(stairBin(stairs));
    }
}
