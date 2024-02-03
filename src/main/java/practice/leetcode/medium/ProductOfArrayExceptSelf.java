package practice.leetcode.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] productExceptSelf(int[] nums) {
        // main array
        // prefix array
        // suffix array
        // output

        // prefix
        int[] prefixArray = getPrefixArray(nums);
        // suffix
        int[] postfixArray = getPostfixArray(nums);

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prefixValue = getOrDefaultPrefixValue(prefixArray, i);
            int postFixValue = getOrDefaultPostFixValue(nums, postfixArray, i);
            result[i] = prefixValue * postFixValue;
        }
        return result;
    }

    private static int getOrDefaultPrefixValue(int[] prefixArray, int i) {
        int prefixValue;
        if (i == 0) {
            prefixValue = 1;
        } else {
            prefixValue = prefixArray[i - 1];
        }
        return prefixValue;
    }

    private static int getOrDefaultPostFixValue(int[] nums, int[] postfixArray, int i) {
        int postFixValue;
        if (i == nums.length - 1) {
            postFixValue = 1;
        } else {
            postFixValue = postfixArray[i + 1];
        }
        return postFixValue;
    }

    private static int[] getPrefixArray(int[] nums) {
        int[] prefixArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prev = getOrDefaultPrefixValue(prefixArray, i);
            prefixArray[i] = nums[i] * prev;
        }
        //System.out.println(Arrays.toString(prefixArray));
        return prefixArray;
    }

    private static int[] getPostfixArray(int[] nums) {
        int[] postfixArray = new int[nums.length];
        for (int i = nums.length - 1; i > -1; i--) {
            int next = getOrDefaultPostFixValue(nums, postfixArray, i);
            postfixArray[i] = nums[i] * next;
        }
        //System.out.println(Arrays.toString(postfixArray));
        return postfixArray;
    }
}
