package algo.sorting;

import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j + 1];
                    items[j + 1] = items[j];
                    items[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        sort(new int[]{6, 3, 0, 5});
        sort(new int[]{64, 25, 3, 12, 22, 11, 6});
        //sortDesc(new int[]{64, 25, 3, 12, 22, 11, 6});
    }
}
