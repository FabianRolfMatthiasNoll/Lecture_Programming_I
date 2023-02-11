package VL7;
import java.util.Arrays;
public class Task5_Merge_Quicksort {
    public static void main(String args[]){
        int[] array = {5, 2, 8, 1, 9, 3};
        MergeSort sorter = new MergeSort();
        //QuickSort sorter = new QuickSort();
        int[] sortedArray = sorter.sort(array);
        for (int element : sortedArray) {
            System.out.print(element + ", ");
        }
    }
    public static class MergeSort implements Sorter {

        @Override
        public int[] sort(int[] toSort) {
            if (toSort.length > 1) {
                // Split the array in half
                int[] left = Arrays.copyOfRange(toSort, 0, toSort.length / 2);
                int[] right = Arrays.copyOfRange(toSort, toSort.length / 2, toSort.length);

                // Sort each half
                sort(left);
                sort(right);

                // Merge the sorted halves back together
                merge(toSort, left, right);
            }
            return toSort;
        }

        public void merge(int[] array, int[] left, int[] right) {
            int leftIndex = 0;
            int rightIndex = 0;
            int arrayIndex = 0;

            // Compare the values from each half and add the smaller one to the array
            while (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    array[arrayIndex] = left[leftIndex];
                    leftIndex++;
                } else {
                    array[arrayIndex] = right[rightIndex];
                    rightIndex++;
                }
                arrayIndex++;
            }

            // Add any remaining values from the left half
            while (leftIndex < left.length) {
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
                arrayIndex++;
            }

            // Add any remaining values from the right half
            while (rightIndex < right.length) {
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }
    }

    public static class QuickSort implements Sorter {
        public int[] sort(int[] toSort) {
            // Wenn das Array leer oder nur ein Element hat, gib es zurück
            if (toSort == null || toSort.length <= 1) {
                return toSort;
            }

            // Bestimme das Pivot-Element
            int pivot = toSort[toSort.length / 2];

            // Teile das Array in zwei Hälften auf, eine mit Elementen, die kleiner als das Pivot-Element sind,
            // und eine mit Elementen, die größer sind
            int[] left = Arrays.stream(toSort).filter(i -> i < pivot).toArray();
            int[] right = Arrays.stream(toSort).filter(i -> i > pivot).toArray();

            // Sortiere die beiden Hälften rekursiv mit Quick Sort
            left = sort(left);
            right = sort(right);

            // Füge die beiden sortierten Hälften zusammen und gib das Ergebnis zurück
            int[] result = new int[toSort.length];
            System.arraycopy(left, 0, result, 0, left.length);
            result[left.length] = pivot;
            System.arraycopy(right, 0, result, left.length + 1, right.length);
            return result;
        }
    }

}
