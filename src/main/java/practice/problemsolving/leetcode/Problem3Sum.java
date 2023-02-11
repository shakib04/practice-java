package practice.problemsolving.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */

/**
 * how to solve?
 * validation: if length = 3 and sum not 0, then just return empty list; if sum = 0; just return that triplet
 * example 1: greedy approach, take 3 and make combination
 * [-1,0,1,2, ] => [-1,0,1], [-1,1,2], [-1,2,-1], [-1,-1,-4], [-1,
 */

public class Problem3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 3){
            int sum = Arrays.stream(nums).sum();
            if (sum == 0){
                return Arrays.asList(
                        Arrays.stream(nums).boxed().collect(Collectors.toList())
                );
            }else {
                return new ArrayList<>();
            }
        }else {

            // create list of 3 numbers from the array
            List<List<Integer>> listOfIntegers = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[i+1]);
                triplet.add(nums[i+2]);

                listOfIntegers.add(triplet);
                for (int j = 0; j < nums.length; j++) {

                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
