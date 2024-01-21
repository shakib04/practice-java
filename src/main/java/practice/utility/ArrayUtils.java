package practice.utility;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] convertStringToIntArray(String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = StringUtility.convertToASCII(s.charAt(i));
        }
        return result;
    }

    public static String convertStringToIntArray(int[] nums) {
        char[] result = new char[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = StringUtility.getCharFromASCII(nums[i]);
        }
        return Arrays.toString(result);
    }
}
