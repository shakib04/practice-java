package practice.algorithms;

import java.util.Arrays;

public class MergeSort2 {
    public static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int midIndex = leftIndex + (rightIndex - 1) / 2;
            mergeSort(arr, leftIndex, midIndex);
            mergeSort(arr, midIndex + 1, rightIndex);
            merge(arr, leftIndex, midIndex, rightIndex);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {

        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + 1];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = array[mid + 1 + i];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2){
           if (L[i] <= R[j]){
               array[k] = L[i];
               i++;
           }else {
               array[k] = R[j];
               j++;
           }
           k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1){
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        //int[] arr = {38, 27, 43};
        System.out.println("Given: " + Arrays.asList(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.asList(arr));
    }
}
