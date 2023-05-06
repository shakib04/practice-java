package practice.problemsolving.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElementV2(int[] nums) {
        Arrays.sort(nums);
        int maximumFound = 0;
        int result = 0;
        HashMap<Integer, Integer> occurances = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (occurances.containsKey(n)){
                occurances.put(n, occurances.get(n) + 1);
            }else {
                occurances.put(n, 1);
            }
            if (maximumFound < occurances.get(n)){
                maximumFound = occurances.get(n);
                result = n;
            }
        }
        return result;
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> occurances = new HashMap<>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // put in map
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (occurances.containsKey(n)){
                occurances.put(n, occurances.get(n) + 1);
            }else {
                occurances.put(n, 1);
            }
        }

        // add values to list
        for (Map.Entry<Integer, Integer> entry : occurances.entrySet()) {
            list.add(entry.getValue());
        }

        // list sorting
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                return (n1).compareTo(n2);
            }
        });

        int keyOfLastValue = 0;
        //
        for (Integer str : list) {
            for (Map.Entry<Integer, Integer> entry : occurances.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                    keyOfLastValue = entry.getKey();
                }
            }
        }

        return keyOfLastValue;
    }

    public static void main(String[] args) {
        new MajorityElement().majorityElementV2(new int[]{3,2,3});
    }

    /**
     * Link: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&id=top-interview-150
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [3,2,3]
     * Output: 3
     * Example 2:
     *
     * Input: nums = [2,2,1,1,1,2,2]
     * Output: 2
     *
     *
     * Constraints:
     *
     * n == nums.length
     * 1 <= n <= 5 * 10^4
     * -10^9 <= nums[i] <= 10^9
     *
     *
     * Follow-up: Could you solve the problem in linear time and in O(1) space?
     */
}
