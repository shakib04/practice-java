package practice.algorithms;

import java.util.Arrays;

public class MergeSort2 {
    public static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arr, leftIndex, midIndex);
            int a = arr[midIndex];
            int b = arr[rightIndex];
            if (a > b) {
                //int temp = arr[midIndex];
                arr[rightIndex] = a;
                arr[leftIndex] = b;
            }
            //mergeSort(arr, midIndex + 1, rightIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Given: " + Arrays.asList(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.asList(arr));
    }
}
