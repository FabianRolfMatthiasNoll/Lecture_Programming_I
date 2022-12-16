package BubbleSorting;

public class Main {
    public static void main(String[] args){
        var sorter = new BubbleSort();
        int[] unsorterdArray = {2,17,88,96,3,56,1,9,20,23};
        var output = sorter.sort(unsorterdArray);
        for (int i = 0; i < output.length; i++) {
            System.out.println(i + 1 + ": " + output[i]);
        }
    }
}
