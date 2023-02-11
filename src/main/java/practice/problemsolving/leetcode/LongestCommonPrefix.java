package practice.problemsolving.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * solution:
 * find all sub string by prefix. of first word. flow => f, fl, flo, flow
 * match with other words. like =>  if matched with f, then fl, then flo, then flow, else break and remember last matching, it helps to stop the code; next same checking
 * validation:
 *
 * solution2: 
 * take 1st item as a result
 * loop and match each substring with result; if match then concat else break and start with second item
 * validation for ""
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String lastMatching = strs[0];
        // find all sub string by prefix. of first word. flow => f, fl, flo, flow
        List<String> prefixSubStringList = new ArrayList<>();
        String prefixSubString = "";
        for (int i = 0; i < strs[0].length(); i++) {
            prefixSubString += strs[0].charAt(i);
            prefixSubStringList.add(prefixSubString);
        }

        // match with other words. like =>  if matched with f, then fl, then flo, then flow, else break and remember last matching, it helps to stop the code; next same checking
        String leastMatching = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            if (word.equals("")) {
                leastMatching = "";
                break;
            }
            String tempPrefix = "";
            for (int j = 0; j < word.length(); j++) {
                tempPrefix += word.charAt(j);
                if (prefixSubStringList.contains(tempPrefix)) {
                    if (tempPrefix.length() <= leastMatching.length() && j == word.length() - 1){
                        leastMatching = tempPrefix;
                        continue;
                    }else if(tempPrefix.length() <= leastMatching.length()){
                        continue;
                    }else {
                        leastMatching = tempPrefix.substring(0, tempPrefix.length()-1);
                        break;
                    }
                }
                else if(j == 0){
                    leastMatching = "";
                    break;
                }else{
                    leastMatching = tempPrefix.substring(0, tempPrefix.length()-1);
                    break;
                }
            }
            if (leastMatching.equals("")) break;
        }

        //System.out.println(prefixSubStringList);
        return leastMatching;
    }

    public String longestCommonPrefixV2(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            if (word.equals("")) {
                result = "";
                break;
            }
            for (int j = 1; j <= word.length(); j++) {
                if (result.startsWith(word.substring(0, j))){
                    if (word.length() == j){
                        result = word.substring(0, j);
                    }
                }else{
                    result = word.substring(0, j-1);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        //String[] strings = {"abab","aba",""};
        LongestCommonPrefix object = new LongestCommonPrefix();
        System.out.println(object.longestCommonPrefixV2(strings));
    }
}
