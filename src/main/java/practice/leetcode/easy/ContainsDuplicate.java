package practice.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        //System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        int x = 10;
        if (x % 3 != 0 && x% 5 != 0){
            throw new RuntimeException("x is no valid");
        }
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> prev = new HashSet<>();
        for (int num : nums) {
            if (prev.contains(num)) {
                return true;
            }
            prev.add(num);
        }
        return false;
    }
}
