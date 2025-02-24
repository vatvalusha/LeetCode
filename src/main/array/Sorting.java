package array;

public class Sorting {

    // Method to perform bubble sort on an integer array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Loop over the array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
