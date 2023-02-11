package practice.problemsolving.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * question link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */

public class LetterCombinationOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.trim().equals(""))
            return new ArrayList<>();

        List<String> result = new ArrayList<>();
        result.add("");

        if (digits.length() == 1){
            return combinationOfTwo(digits, result);
        }
        digits = new StringBuilder(digits).reverse().toString();
        for (int i = 0; i < digits.length(); i++) {
            result = combinationOfTwo(digits.substring(i,i+1), result);
        }
        return result;
    }

    public List<String> combinationOfTwo(String digit, List<String> stringList) {
        if (digit == null) return stringList;
        int l1 = getTotalCharacterInDigit(digit);

        String charactersInDigit = this.getCharactersInDigit(digit);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < l1; i++) {
            for (String string: stringList) {
                String combination = charactersInDigit.charAt(i) + string;
                result.add(combination);
            }
        }
        return result;
    }

    public int getTotalCharacterInDigit(String num){
        if (num.equals("7") || num.equals("9")) {
            return  4;
        } else {
            return 3;
        }
    }

    public String getCharactersInDigit(String num) {
        switch (num) {
            case "2":
                return "abc";
            case "3":
                return "def";
            case "4":
                return "ghi";
            case "5":
                return "jkl";
            case "6":
                return "mno";
            case "7":
                return "pqrs";
            case "8":
                return "tuv";
            case "9":
                return "wxyz";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        LetterCombinationOfAPhoneNumber object = new LetterCombinationOfAPhoneNumber();
        System.out.println(object.letterCombinations("23"));
        System.out.println(object.letterCombinations(""));
        System.out.println(object.letterCombinations("2"));
    }
}
