package practice.problemsolving.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1,8,6,2,5,4,8,3,7
// 1,

// find container; divide the array / 2; 9 / 2 = 4;
// left most max number index; right most max number index;
// left most number is 8; index = 1; right most number is 7; index = 8;
// calculate difference between index and multiply with lowest between these two number;
// index difference = 7; lowest(8,7) = 7;
// index difference * lowest(8,7); = 7 * 7 = 49;


public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int mid = height.length / 2;

        int leftMostNumberIndex = 0;
        int leftMostNumber = 0;
        int rightMostNumberIndex = 0;
        int rightMostNumber = 0;
        for (int i = 0; i < height.length; i++) {
            if (i < mid){
                if (leftMostNumber < (height[i])){
                    leftMostNumber = height[i];
                    leftMostNumberIndex = i;
                }
            }else {
                if (rightMostNumber < (height[i] + i)){
                    rightMostNumber = height[i];
                    rightMostNumberIndex = i;
                }
            }
        }
        int differenceBetweenIndex = rightMostNumberIndex - leftMostNumberIndex;
        int lowestNumberBetweenThese = 0;
        if (leftMostNumber > rightMostNumber){
            lowestNumberBetweenThese = rightMostNumber;
        }else {
            lowestNumberBetweenThese = leftMostNumber;
        }

        return differenceBetweenIndex * lowestNumberBetweenThese;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,25,7}));
        System.out.println(maxArea(new int[]{1,2,4,3}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
