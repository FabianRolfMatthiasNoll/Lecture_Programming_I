public class HeapSort{
    public void sort(int[] toSort) {
        int n = toSort.length;

        // Erstelle einen Heap aus dem Array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(toSort, n, i);

        // Entferne das größte Element aus dem Heap und füge es am Ende des Arrays ein
        for (int i=n-1; i>=0; i--) {
            int temp = toSort[0];
            toSort[0] = toSort[i];
            toSort[i] = temp;

            heapify(toSort, i, 0);
        }
    }

    // Methode zum Erstellen eines Heaps aus einem Array
    void heapify(int arr[], int n, int i) {
        int largestNode = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largestNode])
            largestNode = left;

        if (right < n && arr[right] > arr[largestNode])
            largestNode = right;

        if (largestNode != i) {
            int swap = arr[i];
            arr[i] = arr[largestNode];
            arr[largestNode] = swap;

            heapify(arr, n, largestNode);
        }
    }
}