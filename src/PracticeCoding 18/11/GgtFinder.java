package Homework2;

public class GgtFinder {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 15;
        int x = ggt(val1, val2);
        System.out.println(x);

    }

    public static int ggt(int a, int b) {

        if (a == 0)
            return 0;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;

        /* Modulo Variant
        while (b != 0) {
            if (a > b)
                a = a % b;
            else if(a != 0)
                b = b % a;
            else{
                return b;
            }
        }
         */
    }
}