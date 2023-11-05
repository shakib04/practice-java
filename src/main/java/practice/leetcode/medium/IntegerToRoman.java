package practice.leetcode.medium;

import java.util.Hashtable;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "I");
        ht.put(5, "V");
        ht.put(10, "X");
        ht.put(50, "L");
        ht.put(100, "C");
        ht.put(500, "D");
        ht.put(1000, "M");

        StringBuilder result = new StringBuilder();
        while (true) {
            if (num <= 0) break;
            if (num >= 1000) {
                result.append(ht.get(1000));
                num -= 1000;
            } else if (num >= 500) {
                if (num >= 900) {
                    result.append(ht.get(100)).append(ht.get(1000));
                    num -= 900;
                } else {
                    result.append(ht.get(500));
                    num -= 500;
                }
            } else if (num >= 100) {
                if (num >= 400) {
                    result.append(ht.get(100)).append(ht.get(500));
                    num -= 400;
                } else {
                    result.append(ht.get(100));
                    num -= 100;
                }
            } else if (num >= 50) {
                if (num >= 90) {
                    result.append(ht.get(10)).append(ht.get(100));
                    num -= 90;
                } else {
                    result.append(ht.get(50));
                    num -= 50;
                }
            } else if (num >= 10) {
                if (num >= 40) {
                    result.append(ht.get(10)).append(ht.get(50));
                    num -= 40;
                } else {
                    result.append(ht.get(10));
                    num -= 10;
                }
            } else if (num >= 5) {
                if (num == 9) {
                    result.append(ht.get(1)).append(ht.get(10));
                    num -= 9;
                } else{
                    result.append(ht.get(5));
                    num -= 5;
                }
            } else if (num >= 1) {
                 if (num == 4) {
                    result.append(ht.get(1)).append(ht.get(5));
                    num -= 4;
                } else {
                    result.append(ht.get(1));
                    num -= 1;
                }
            }
        }
        return result.toString();
    }
}

/**
 * Leetcode URL: https://leetcode.com/problems/integer-to-roman/description/
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * Example 2:
 *
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 3:
 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= num <= 3999
 */
