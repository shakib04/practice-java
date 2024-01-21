package practice.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/group-anagrams/description/
 */

public class GroupAnagram {
    public static void main(String[] args) {
        // hashmap to store data
        // loop the items
        // sort
        // add into map sorted => key, item => value
        // return value

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strings);
        System.out.println(lists);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String item : strs) {
            String sort = sortString(item);
            if (!hashMap.containsKey(sort)) {
                hashMap.put(sort, new ArrayList<>());
            }
            hashMap.get(sort).add(item);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static List<List<String>> groupAnagramsV2(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String item : strs) {
            String characterPresence = calculateCharacterPresence(item);
            if (!hashMap.containsKey(characterPresence)) {
                hashMap.put(characterPresence, new ArrayList<>());
            }
            hashMap.get(characterPresence).add(item);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static String calculateCharacterPresence(String inputString) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char c : hashMap.keySet()) {
            result.append(c).append(hashMap.get(c));
        }
        return result.toString();
    }

    public static String sortString(String inputString) {
        // Converting input string to character array
        char[] tempArray = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
}
