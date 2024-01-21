package practice.utility;

import practice.common.sortingAlgo.MergeSort;

public class StringUtility {

    public static char getCharFromASCII(int i) {
        return (char) i;
    }

    public static int convertToASCII(char c) {
        return c;
    }

    public static int[] sort(String s) {
        int[] ints = ArrayUtils.convertStringToIntArray(s);
        MergeSort.sort(ints);
        return ints;
    }
}
