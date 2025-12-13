import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Practice31_Sort {

    /*
    * How Selection Sort Works
    * Repeatedly finds the minimum element from the unsorted part of the array
    * Swaps it with the first element of the unsorted part
    *
    * Time Complexity: O(n²) (best, average, worst)
    * Space Complexity: O(1) (in-place sorting)
    *
    * Why Selection Sort is NOT used in real projects
    * 1. Poor performance: Time complexity is always O(n²). Even if the array is already sorted, it still does all comparisons. For large datasets, this is very slow
    * 👉 Modern applications deal with thousands or millions of records, so Selection Sort becomes impractical.
    * */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    /*
     * How Bucket Sort Works
     * Divides elements into buckets
     * Sorts each bucket individually
     * Merges all buckets
     *
     * Time Complexity:
     * Average: O(n)
     * Worst: O(n²)
     *
     * Space Complexity:
     * O(n)
     *
     * When to use Bucket Sort
     * 1. Uniformly distributed data
     * 👉 Rare in interviews, good conceptually
     */

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    /*
     * How Insertion Sort Works
     * Builds the sorted array one element at a time
     * Takes an element from the unsorted part and inserts it into its correct position
     * Similar to sorting playing cards in hand
     *
     * Time Complexity:
     * Worst Case: O(n²)
     * Average Case: O(n²)
     * Best Case: O(n) (when the array is already sorted)
     *
     * Space Complexity:
     * O(1) (in-place sorting)
     *
     * Why Insertion Sort is used
     * 1. Efficient for small datasets
     * 2. Very fast for nearly sorted arrays
     * 3. Used internally in hybrid sorting algorithms
     * 👉 Suitable when data is partially sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    /*
     * How Merge Sort Works
     * Divides the array into two halves recursively
     * Sorts each half
     * Merges the sorted halves back together
     * Uses divide and conquer technique
     *
     * Time Complexity:
     * Worst Case: O(n log n)
     * Average Case: O(n log n)
     * Best Case: O(n log n)
     *
     * Space Complexity:
     * O(n) (requires extra memory)
     *
     * Why Merge Sort is used
     * 1. Guaranteed O(n log n) performance
     * 2. Stable sorting algorithm
     * 3. Suitable for large datasets
     * 👉 Used in systems where stability is required
     */
    public void mergeSort(int[] arr) {
        // TODO
    }

    /*
     * How Quick Sort Works
     * Chooses a pivot element
     * Partitions the array so that:
     * - Elements smaller than pivot go to the left
     * - Elements greater than pivot go to the right
     * Recursively sorts both sides
     *
     * Time Complexity:
     * Worst Case: O(n²) (rare, bad pivot choice)
     * Average Case: O(n log n)
     * Best Case: O(n log n)
     *
     * Space Complexity:
     * O(log n) (recursive stack)
     *
     * Why Quick Sort is used
     * 1. Very fast in practice
     * 2. In-place sorting algorithm
     * 3. Preferred for large datasets
     * 👉 Used internally for primitive arrays in Java
     */
    public static void quickSort(int[] arr) {
        // TODO
    }

    /*
     * How Heap Sort Works
     * Converts the array into a max heap
     * Repeatedly removes the largest element
     * Places it at the end of the array
     *
     * Time Complexity:
     * Worst Case: O(n log n)
     * Average Case: O(n log n)
     * Best Case: O(n log n)
     *
     * Space Complexity:
     * O(1) (in-place sorting)
     *
     * Why Heap Sort is used
     * 1. Guaranteed O(n log n) performance
     * 2. Does not require extra memory
     * 👉 Used when memory usage is a concern
     */
    public static void heapSort(int[] arr) {
        // TODO
    }

    // TODO
}
