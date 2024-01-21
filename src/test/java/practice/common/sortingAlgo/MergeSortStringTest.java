package practice.common.sortingAlgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortStringTest {

    @Test
    void sort() {
        String s = MergeSortString.sort("bcad");
        assertEquals("abcd", s);
    }
}