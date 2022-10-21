package practice.algorithms;

import java.util.Arrays;

public class MergeSortImpl {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        int[] result = MergeSortImpl.mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.asList(result));
    }

    private static int[] mergeSort(int[] numbers, int leftIndex, int rightIndex) {
        int mid = (leftIndex + rightIndex) / 2;
        int[] left = new int[mid];
        int[] right = new int[numbers.length - mid];




        if (numbers.length > 1){
            for (int i = leftIndex; i < mid; i++) {
                left[i] = numbers[i];
            }
            leftIndex = leftIndex;
            rightIndex = mid;
            mergeSort(left, leftIndex, rightIndex);
        }

        if (numbers.length > 1){
            for (int i = mid; i < numbers.length - mid; i++) {
                right[i] = numbers[i];
            }
            leftIndex = mid;
            rightIndex = right.length - 1;
            mergeSort(right, leftIndex, rightIndex);
        }

        mergeIt(numbers, leftIndex, rightIndex);

        return numbers;
    }

    static void mergeIt(int arr[], int leftIndex, int rightIndex){
        if (arr[leftIndex] > arr[rightIndex]){
            arr[rightIndex] = arr[leftIndex];
        }else {
            arr[leftIndex] = arr[rightIndex];
        }
    }
}
