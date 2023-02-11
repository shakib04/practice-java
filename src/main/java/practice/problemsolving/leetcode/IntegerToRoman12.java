package practice.problemsolving.leetcode;

/**
 * Url: https://leetcode.com/problems/integer-to-roman/
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * Example 2:
 * <p>
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 3:
 * <p>
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= num <= 3999
 *
 *
 *
 * calculation for 3:
 * 3 is less than 5 and not equal to 4. so answer = III
 * 58 is greater than 50 and less than 98. divide by 50, 58 / 50 = 1 and reminder = 8;
 * for result = 1; put L; and reminder is greater than 4 and equal to 8. so VIII
 * final result = LVIII
 *
 * calculation for: 40;
 * count roman number 1 to 50
 * 1 == i
 * 2 == ii
 * 3 == iii
 * 4 == iv
 * 5 == v
 * 6 == vi
 * 7 == vii
 * 8 == viii
 * 9 == ix
 * 10 == x
 * 11 == xi
 * 12 == xii
 * 13 == xiii
 * 14 == xiv
 * 15 == xv
 * 16 == xvi
 * 17 == xvii
 * 18 == xviii
 * 19 == xix
 * 20 == xx
 *
 * 18 / 10 = 1=X; 18 % 10 = 8;
 * 8 / 5 = 1 = V; 8 % 5 = 3 = III;
 * result = XVIII;
 *
 * 19 / 10 = 1 ==> X; 19 % 10 = 9; if  9+1 == 10; IX
 *
 */

public class IntegerToRoman12 {

    // 1st observation: put higher number in first for if/else
    // list of exception case; 4, 9, 40
    // put 1 to 10 conversion logic



    public String intToRoman(int num) {
        String result = "";
        int reminder = 0;

        if (num >= 999){
            result = "M";
            reminder = num % 999;
            num = num / 1000;
            if (reminder == 0){
                result = "";
            }
        }

        if (num >= 499 && num <= 998) {

        }

        if (num >= 99 && num <= 498) {
            result += "";
        }
        if (num >= 49 && num <= 98) {

        }

        if (num >= 9 && num <= 48) {

        }

        if (num >= 4 && num <= 8) {

        }

        return "2";
    }

    public static void main(String[] args) {
        IntegerToRoman12 test = new IntegerToRoman12();
        test.intToRoman(3);
        test.intToRoman(58);
        test.intToRoman(1994);
    }
}
