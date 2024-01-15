package practice.leetcode.easy;

import java.util.Arrays;

/**
 * Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSumTwo {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = nums.length - 1;
        while (end > start) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return result;
    }
}
