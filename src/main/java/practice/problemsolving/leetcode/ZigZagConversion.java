package practice.problemsolving.leetcode;

/** 1,2,3,4,5,6,7,8,9,10,11,12,13,14
 * 1, 5, 9, 13 (adding 4)
 * 2, 4, 6, 8, 10, 12, 14 (adding 2)
 * 3, 7, 11 (adding 4)
 * lets build an algorithm
 * loop row times
 * zigzag pattern build
 *
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * 1,2,3,4,5,6,7,8,9,10,11,12,13,14
 *
 * 1, 7, 13 (adding 6)
 * 2, 6, 8, 12,
 * 3, 5, 9, 11,
 * 4, 10
 *
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows <= 1 || s.length() <= 1)
            return s;
        String result = "";

        String[] chars = new String[s.length()];
        for (int i = 0; i < numRows; i++) {
            chars[i] = "";
        }

        int row = 0;
        boolean down = false;

        for (int i = 0; i < s.length(); i++) {
            chars[row] += s.charAt(i);
            if (row == 0)
                down = true;
            if (row == numRows - 1)
                down = false;
           row += down ? 1 : -1;
        }

        for (int i = 0; i < numRows; i++) {
            result += chars[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
