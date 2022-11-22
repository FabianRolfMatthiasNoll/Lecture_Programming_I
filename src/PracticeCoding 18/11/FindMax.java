package Homework2;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] unsortedList = {4, 8, 99, 136, 42, 3, 7};
        findMax(unsortedList);
    }
    public static int findMax(int[] anUnsortedList) {
        int max = Arrays.stream(anUnsortedList).max().getAsInt();
        System.out.println("Maximum Number is: " + max);
        return 0;
    }
}
