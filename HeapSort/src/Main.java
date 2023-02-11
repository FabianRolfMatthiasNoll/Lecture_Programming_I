import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] testArray = {3, 5, 2, 1, 4};
        HeapSort heapSorter = new HeapSort();
        heapSorter.sort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}