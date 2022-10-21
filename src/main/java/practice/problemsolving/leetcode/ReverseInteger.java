package practice.problemsolving.leetcode;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */


/**
 * 123 / 10 = 12, 12 / 10 = 1, 1 / 10 = 0
 * 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
 */

public class ReverseInteger {

    public static int reverse(int x) {
        if(x > -1 && x < 10)
            return x;
        boolean isNegative = false;
        if (x < 0){
            x = x * -1;
            isNegative = true;
        }
        String revereString = "";
        while (x != 0) {
            revereString += String.valueOf(x % 10);
            x = x / 10;
        };
        if (isNegative)
            revereString = "-" + revereString;
        try {
            return new Integer(revereString);
        }catch (NumberFormatException numberFormatException){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(2));
    }
}
