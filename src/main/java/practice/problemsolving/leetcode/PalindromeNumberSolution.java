package practice.problemsolving.leetcode;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */

// 121, 0 * 1 + 1 = 1; 1 * 10 + 2 = 12; 12 * 10 + 1 = 121;
// 24642; 0 * 1 + 2 = 2; 2 * 10 + 4 = 24; 24 * 10 + 6 = 246; 246 * 10 + 4 = 2464;

public class PalindromeNumberSolution {

    public static boolean isPalindrome(int x) {
        if (x < 10 && x > -1)
            return true;
        int number = x;
        int count = 0;
        int intResult = 0;
        while (number > 0){
            int reminder = number % 10;
            if (count == 0){
                intResult = intResult * 1 + reminder;
            }else {
                intResult = intResult * 10 + reminder;
            }
            number = number / 10;
            count++;
        }

        if (intResult == x){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println("0::" + isPalindrome(0));
        System.out.println("121::" + isPalindrome(121));
    }

//    public boolean isPalindrome(int x) {
//        if (x < 10 && x > -1)
//            return true;
//        int number = x;
//        int divisor = 1;
//        String stringResult = "";
//        while (number > 0){
//            stringResult += number % 10;
//            number = number / 10;
//        }
//        if (stringResult.equals(x+"")){
//            return true;
//        }else return false;
//    }
}
