package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 7, 7, 7, 7, 8, 9, 13, 23, 34, 66};
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 50000; i+=6) {
            numbers.push(i);
        }
        System.out.println(new BinarySearch().implOfBinarySearch(numbers.stream().mapToInt(x-> x).toArray(), 36960));
    }

    public int implOfBinarySearch(int[] nums, int findingData) {
        int result;
        int left = 0;
        int right = nums.length - 1;

        while (true) {
            int midIndex = (left + right) / 2;
            if (left > right){
                result = -1;
                break;
            }
            int midNumber = nums[midIndex];
            if (midNumber == findingData) {
                result = midIndex;
                break;
            } else if (findingData > midNumber) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }

        return result;
    }
}
