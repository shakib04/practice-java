package practice.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumV2 {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int r = 3;

        List<int[]> zeroSumPermutations = getZeroSumPermutations(arr, r);
        System.out.println("Permutations with sum 0:");
        for (int[] permutation : zeroSumPermutations) {
            System.out.println(Arrays.toString(permutation));
        }
    }

    static List<int[]> getZeroSumPermutations(int[] arr, int r) {
        List<int[]> results = new ArrayList<>();
        permutations(arr, r, 0, new int[r], results, 0);
        return results;
    }

    static void permutations(int[] arr, int r, int index, int[] data, List<int[]> results, int currentSum) {
        if (index == r) {
            if (currentSum == 0 && isValidPermutation(data)) {
                results.add(Arrays.copyOf(data, r));
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!containsDuplicate(data, arr[i], index)) {
                data[index] = arr[i];
                permutations(arr, r, index + 1, data, results, currentSum + arr[i]);
            }
        }
    }

    static boolean containsDuplicate(int[] data, int element, int index) {
        for (int i = 0; i < index; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    static boolean isValidPermutation(int[] data) {
        return !(Arrays.equals(data, new int[]{-1, 0, 1}) || Arrays.equals(data, new int[]{0, 1, -1}));
    }
}
