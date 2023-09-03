// Sortable interface
interface Sortable {
    void sort(int[] arr);
}

// BubbleSort class
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

// SelectionSort class
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

public class app6 {
    public static void main(String[] args) {
        int[] arr1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] arr2 = { 64, 25, 12, 22, 11, 90, 34 };

        // Using BubbleSort
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr1);
        System.out.println("BubbleSort Sorted Array:");
        printArray(arr1);

        // Using SelectionSort
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.println("SelectionSort Sorted Array:");
        printArray(arr2);
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
