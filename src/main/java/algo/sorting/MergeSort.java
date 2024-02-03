package algo.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void concur(int[] left, int[] right) {
        System.out.println();
        System.out.println("from concur");

        int[] arr = new int[left.length + right.length];


        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < left.length && i < right.length; i++) {
            if (left[j] > right[k]) {
                arr[i] = right[k];
                k++;
            } else {
                arr[i] = left[j];
                j++;
            }
        }

        while (j < left.length) {
            arr[i] = left[j];
            j++;
            i++;
        }

        while (k < right.length) {
            arr[i] = right[k];
            k++;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] nums) {
        System.out.println("");
        System.out.println("from divide");
        int mid = nums.length / 2;
        System.out.print("=> ");
        int[] leftItems = new int[mid];
        for (int i = 0; i < mid; i++) {
            leftItems[i] = nums[i];
        }
        System.out.print(Arrays.toString(leftItems));
        System.out.print("\t");

        int[] rightItems = new int[nums.length - mid];
        int k = 0;
        for (int i = mid; i < nums.length; i++) {
            rightItems[k] = nums[i];
            k++;
        }
        System.out.println(Arrays.toString(rightItems));

        if (leftItems.length > 1) {
            divide(leftItems);
        }


        if (rightItems.length > 1) {
            divide(rightItems);
        }
        concur(leftItems, rightItems);
    }


    private static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] leftItems = new int[mid - left + 1];
        int[] rightItems = new int[right - mid];

        for (int i = 0; i < leftItems.length; i++) {
            leftItems[i] = arr[left + i];
        }

        for (int i = 0; i < rightItems.length; i++) {
            rightItems[i] = arr[mid + 1 + i];
        }



        int i = left;
        int j = 0;
        int k = 0;
        for (; j < leftItems.length && k < rightItems.length; i++) {
            if (leftItems[j] > rightItems[k]) {
                arr[i] = rightItems[k];
                k++;
            } else {
                arr[i] = leftItems[j];
                j++;
            }
        }

        while (j < leftItems.length) {
            arr[i] = leftItems[j];
            j++;
            i++;
        }

        while (k < rightItems.length) {
            arr[i] = rightItems[k];
            k++;
            i++;
        }

//        System.out.println(Arrays.toString(leftItems));
//        System.out.println(Arrays.toString(rightItems));
    }

    public static void main(String[] args) {
        //int[] ints = {14, 5, 3, 34, 3, 6, 84, 7, 32};
        int[] ints = {12, 11, 13, 5, 6, 7};
        merge_sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}


