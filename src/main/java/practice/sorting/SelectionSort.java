package practice.sorting;

import java.util.Arrays;

public class SelectionSort {

    static void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] < items[smallest]) {
                    smallest = j;
                }
            }
            int temp = items[i];
            items[i] = items[smallest];
            items[smallest] = temp;
        }

        System.out.println(Arrays.toString(items));
    }

    static void sortDesc(int[] items) {
        for (int i = 0; i < items.length; i++) {
            int larger = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j] > items[larger]) {
                    larger = j;
                }
            }
            int temp = items[i];
            items[i] = items[larger];
            items[larger] = temp;
        }
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        sort(new int[]{64, 25, 3, 12, 22, 11, 6});
        sortDesc(new int[]{64, 25, 3, 12, 22, 11, 6});
    }
}
