package Homework2;

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

    public static void main(String args[]){
        int stairs = 40;
        System.out.println(countSteps(stairs));
    }
}
