package practice.problemsolving.leetcode.easy;



public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int midIndex = (left + right) / 2;

        while (true){
            if (target == nums[midIndex]){
                return midIndex;
            } else if (target > nums[midIndex]) {
                left = midIndex + 1;
            }else {
                right = midIndex - 1;
            }
            if (left > right) break;
            midIndex = (left + right) / 2;
        }
        return left;
    }

    public static void main(String[] args) {
        new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 5);
        new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7);
        new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 2);
    }
}
