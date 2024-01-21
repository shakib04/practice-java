package practice.common.sortingAlgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        int[] arr = {6, 3, 63, 2};
        MergeSort.sort(arr);
        int[] sorted = {2, 3, 6, 63};
        assertArrayEquals(sorted, arr);
    }
}