package Homework2;

public class VertauschenAufgabe {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        int tempA = a;
        a = b;
        b = tempA; //bit operation possible / bit-wise OR

        System.out.println("a is " +  a);
        System.out.println("b is " + b);
    }
}