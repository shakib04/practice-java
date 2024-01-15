package practice.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> previousValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (previousValues.containsKey(diff)) {
                return new int[]{previousValues.get(diff), i};
            }
            previousValues.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}

