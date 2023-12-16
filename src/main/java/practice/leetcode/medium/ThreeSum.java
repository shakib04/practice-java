package practice.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {


    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    static int numberOfCombination(int n,
                                   int r) {
        // nCr => n! / (n-r)! * r!
        return factorial(n) / (factorial(n - r) * factorial(r));
    }


    static <T> List<T[]> permutation(T[] items, int r) {

        List<T[]> ss = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {

        }
        return ss;
    }

    // ABCD
    // ABC  BCD
    // ABD
    // ACD

    // ABCDE, 4
    // ABCD  BCDE
    // ABCE
    // ACDE
    // ABDE


    static  <T> List<T[]> combination(T[] items, int r) {

        List<T[]> ss = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {
            T item = items[i];
            Object[] comb = new Object[r];
            comb[0] = item;
            int totalItemLength = 1;
            int j = i + 1;
            int nextAlias = i + 1;
            // BC
            // BD
            while (true) {
                if (j == items.length) {
                    j = i + 2;
                    if (j > items.length) break;
                    nextAlias++;
                }

                if (totalItemLength == r) {
                    ss.add((T[]) comb);
                    totalItemLength = 1;
                    comb[totalItemLength] = items[nextAlias];
                }else {
                    comb[j] = items[j];
                    totalItemLength++;
                    j++;
                }

            }
        }
        return ss;
    }

    public static void main(String[] args) {
        Integer[] s = {3, 5, 6, 8, 4};
        System.out.println(numberOfCombination(s.length, 3));
        System.out.println(numberOfCombination(4, 3));

        String[] abcd = {"A", "B", "C", "D"};
        System.out.println(combination(abcd, 3));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        return null;
    }
}

/**
 * Problem URL: https://leetcode.com/problems/3sum/description/
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 * <p>
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 * <p>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 * <p>
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 * Combination: 01
 * Because, here order is different but letters are same.
 * <p>
 * <p>
 * Find ABCD's Permutation using 02 letter,
 * AB  BA  CA  DA
 * AC  BC  CB  DB
 * AD  BD  CD  DC
 * <p>
 * Total = 12
 * <p>
 * Find ABCD's Combination using 02 letter,
 * AB
 * AC  BC
 * AD  BD  CD
 * <p>
 * Total = 6
 * <p>
 * Equation for Permutation: nPr, = n! / (n-r)!
 * Here,   n = number of letters/items,
 * P = P means permutation
 * r = using how many numbers
 * 4P2 = 4! / (4-2)!
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / 2 = 12
 * <p>
 * <p>
 * Equation for Combination: nPr, = n! / ((n-r)! * r!)
 * Here,   n = number of letters/items,
 * C = C means Combination
 * r = using how many numbers
 * 4C2 = 4! / ((4-2)! * 2!)
 * 4! = 24
 * (4-2)! = 2! = 2
 * ==> 24 / (2*2) = 24/4 = 6
 */


/**
 * Reference Youtube video: https://www.youtube.com/watch?v=XJnIdRXUi7A
 * Discussion about Permutation and Combination:
 * Permutation: Permutation is different ordering items
 * Combination: Collecting the items without consideration of items.
 * Example - ABC, CAB
 * In here Permutation: 02,
 *          Combination: 01
 *  Because, here order is different but letters are same.
 *
 *
 *  Find ABCD's Permutation using 02 letter,
 *  AB  BA  CA  DA
 *  AC  BC  CB  DB
 *  AD  BD  CD  DC
 *
 *  Total = 12
 *
 *  Find ABCD's Combination using 02 letter,
 *  AB
 *  AC  BC
 *  AD  BD  CD
 *
 *  Total = 6
 *
 *  Equation for Permutation: nPr, = n! / (n-r)!
 *  Here,   n = number of letters/items,
 *          P = P means permutation
 *          r = using how many numbers
 *   4P2 = 4! / (4-2)!
 *   4! = 24
 *   (4-2)! = 2! = 2
 *   ==> 24 / 2 = 12
 *
 *
 *   Equation for Combination: nPr, = n! / ((n-r)! * r!)
 *   Here,   n = number of letters/items,
 *           C = C means Combination
 *           r = using how many numbers
 *  4C2 = 4! / ((4-2)! * 2!)
 *  4! = 24
 *  (4-2)! = 2! = 2
 *  ==> 24 / (2*2) = 24/4 = 6
 */