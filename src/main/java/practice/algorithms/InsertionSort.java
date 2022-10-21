package practice.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = 0; j < i; j++) {
                
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {12, 11, 13, 5, 6};
        System.out.println("Given: " + Arrays.asList(arr));
        insertionSort(arr);
        System.out.println("Sorted: " + Arrays.asList(arr));
    }
}
