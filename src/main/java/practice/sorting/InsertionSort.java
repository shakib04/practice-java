package practice.sorting;

import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] items) {
        int[] sorted = new int[items.length];
        sorted[0] = items[0];

        for (int i = 1; i < items.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (items[i] < sorted[j]) {
                    sorted[j + 1] = sorted[j];
                } else {
                    break;
                }
            }
            sorted[j + 1] = items[i];
        }
        System.out.println(Arrays.toString(sorted));
    }

    public static void main(String[] args) {
        sort(new int[]{6, 3, 0, 5});
        sort(new int[]{64, 25, 3, 12, 22, 11, 6, 6,91, 98});
        //sortDesc(new int[]{64, 25, 3, 12, 22, 11, 6});
    }

    /**
     * 6 3 0 5
     * 3 6 0 5
     * 3 0 6 5
     * 0 3 6 5
     * 0 3 5 6
     */

    /**
     * 64 25 3 12 22
     * 25 64 3 12 22
     * 25 3 64 12 22
     * 3 25 64 12 22
     * 3 25 12 64 22
     * 3 12 25 64 22
     * 3 12 25 22 64
     * 3 12 22 25 64
     */
}
