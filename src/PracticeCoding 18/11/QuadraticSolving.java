package Homework2;

import java.lang.Math;

public class QuadraticSolving {

    public static void main(String[] args) {
        //Input of quadratic function
        double ax = 2;
        double bx = 16;
        double c = -18;

        //quadratic function = two results
        double xOne = 0;
        double xTwo = 0;

        //if ax² is bigger than 1 bring the whole equation to x²
        if(ax > 1){
            bx = bx / ax;
            c = c / ax;
            ax = ax / ax;
        }

        xOne = (bx/2 * -1) + Math.sqrt((c * -1) + Math.pow(bx/2, 2));
        xTwo = (bx/2 * -1) - Math.sqrt((c * -1) + Math.pow(bx/2, 2));
        System.out.println(xOne);
        System.out.println(xTwo);
    }
}
