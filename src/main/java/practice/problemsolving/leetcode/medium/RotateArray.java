package practice.problemsolving.leetcode.medium;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k > nums.length){
            k = k % nums.length;
        }
        int[] result = new int[nums.length];
        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, nums.length - k);
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[]nums = new int[]{1};
        new RotateArray().rotate(nums, 1);

        nums = new int[] {-1};
        new RotateArray().rotate(nums, 2);

        nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(nums, 3);



        nums = new int[] {-1, -100, 3, 99};
        new RotateArray().rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
