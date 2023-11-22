package practice.algorithm;

import java.util.ArrayList;
import java.util.Random;

public class SlidingWindowAlgo {

    // 1,2,3,4,5,6  k=3
    // 6,
    // -1 +6 +4 => 9
    // -2 +9 +5 => 12
    // -3 +12 +6 => 15

    public ArrayList<Integer> sumOfSubArray(int[] data, int lengthOfK) {
        ArrayList<Integer> sumList = new ArrayList<>();

        int i = 0;
        int sum = 0;
        for (; i < lengthOfK; i++) {
            sum += data[i];
        }
        sumList.add(sum);

        for (i = 1; i < data.length - (lengthOfK - 1); i++) {
            sum = -data[i - 1] + sum + data[i + lengthOfK - 1];
            sumList.add(sum);
        }

        return sumList;
    }
}

class RunnerOfSlidingWindow {
    public static void main(String[] args) {
        SlidingWindowAlgo slidingWindowAlgo = new SlidingWindowAlgo();


        Random random = new Random();
        int[] nums = new int[5000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(500000);
        }

        // new int[]{1, 2, 3, 4, 5, 6, 7, 8}
        ArrayList<Integer> integers = slidingWindowAlgo.sumOfSubArray(nums, 4);
        System.out.println(integers);
    }
}
