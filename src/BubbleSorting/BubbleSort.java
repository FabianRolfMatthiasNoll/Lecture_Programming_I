package BubbleSorting;

public class BubbleSort implements IBubbleSort {

    @Override
    public int[] sort(int[] toSort) {
        int k;
        for (int i = 0; i < toSort.length - 1; i++) {
            if (toSort[i] < toSort[i + 1]) {
                continue;
            }
            k = toSort[i];
            toSort[i] = toSort[i + 1];
            toSort[i + 1] = k;
            sort(toSort);
        }
        return toSort;
    }
}
