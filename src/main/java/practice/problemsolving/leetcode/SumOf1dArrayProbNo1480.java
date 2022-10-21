package practice.problemsolving.leetcode;

/**
 * Problem Statement
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 *
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */

public class SumOf1dArrayProbNo1480 {

    public int[] runningSum(int[] nums) {
        int[] sumOfArray = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            final int elementValue = nums[i];
            sum += elementValue;
            sumOfArray[i] = sum;
        }
        return sumOfArray;
    }

    static String convertIntArrayToString(int[] value){
        String result = "";
        for (int i = 0; i < value.length; i++) {
            final int elementValue = value[i];
            if (i == value.length - 1){
                result += elementValue;
            }else {
                result += elementValue + ",";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumOf1dArrayProbNo1480 sumOf1dArrayProbNo1480 = new SumOf1dArrayProbNo1480();
        int[] result = sumOf1dArrayProbNo1480.runningSum(new int[]{1,2,3,4});
        System.out.println(convertIntArrayToString(result));

        result = sumOf1dArrayProbNo1480.runningSum(new int[]{1,1,1,1,1});
        System.out.println(convertIntArrayToString(result));

        result = sumOf1dArrayProbNo1480.runningSum(new int[]{3,1,2,10,1});
        System.out.println(convertIntArrayToString(result));
    }
}
