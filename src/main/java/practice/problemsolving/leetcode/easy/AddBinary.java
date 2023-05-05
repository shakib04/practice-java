package practice.problemsolving.leetcode.easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();

        int lengthDifference = a.length() - b.length();
        StringBuilder padding = new StringBuilder("");
        for (int i = 0; i < Math.abs(lengthDifference); i++) {
            padding.append("0");
        }
        if (lengthDifference < 0){
            a = padding + a;
        }else if (lengthDifference > 0){
            b = padding + b;
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0'){
                if (carry == 1){
                    result.insert(0, '1');
                }else {
                    result.insert(0, '0');
                }
                carry = 0;
            }

           else if (
                   (a.charAt(i) == '1' && b.charAt(i) == '0') ||
                   (a.charAt(i) == '0' && b.charAt(i) == '1')
            ){
                if (carry == 1){
                    result.insert(0, '0');
                    carry = 1;
                }else {
                    result.insert(0, '1');
                    carry = 0;
                }
           }

           else if (a.charAt(i) == '1' && b.charAt(i) == '1'){
                if (carry == 1){
                    result.insert(0, '1');
                }else {
                    result.insert(0, '0');
                }
                carry = 1;
           }
        }

        return carry == 0 ? result.toString() : '1' + result.toString();
    }

    public static void main(String[] args) {
        new AddBinary().addBinary("11", "1");
    }
}


/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */