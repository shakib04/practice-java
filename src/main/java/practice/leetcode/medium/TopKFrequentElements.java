package practice.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] result = null;
        result = topKFrequentV2(new int[]{1, 1, 1, 2, 2, 3}, 2);
        //result = topKFrequent(new int[]{1,2}, 2);
        result = topKFrequentV2(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] topKFrequentV2(int[] nums, final int k) {
        if (k == 0) return new int[]{};
        HashMap<Integer, Integer> valueToFrequencyMap = new HashMap<>();
        HashMap<Integer, List<Integer>> frequencyToValueMap = new HashMap<>();
        for (int num : nums) {
            int frequency = valueToFrequencyMap.getOrDefault(num, 0) + 1;
            valueToFrequencyMap.put(num, frequency);
            if (frequency > 1) {
                frequencyToValueMap.get(frequency - 1).remove(Integer.valueOf(num));
            }
            List<Integer> dataList = frequencyToValueMap.getOrDefault(frequency, new ArrayList<>());
            dataList.add(num);
            frequencyToValueMap.put(frequency, dataList);
        }

        // 1 -> 2,
        // 2 -> 2,
        // 3 -> 2

        // 2 -> 1,2,3

        int[] result = new int[k];
        int count = 0;
        for (int i = frequencyToValueMap.size();; ) {
            List<Integer> integerList = frequencyToValueMap.get(i);
            for (Integer integer :
                    integerList) {
                result[count] = integer;
                i--;
                count++;
                if (count >= k){
                    return result;
                }
            }
        }
    }

    public static int[] topKFrequent(int[] nums, final int k) {
        if (k == 0) return new int[]{};
        HashMap<Integer, Integer> trackingMap = new HashMap<>();
        for (int num : nums) {
            int frequency = trackingMap.getOrDefault(num, 0) + 1;
            trackingMap.put(num, frequency);
        }

        if (trackingMap.size() <= k) {
            return trackingMap.keySet().stream().mapToInt(Number::intValue).toArray();
        }

        LinkedHashMap<Integer, Integer> sorted = sortByValue(trackingMap);
        int count = 0;
        int[] result = new int[k];
        for (Integer key : sorted.keySet()) {
            result[count] = key;
            count++;
            if (count >= k) {
                return result;
            }
        }
        return result;
    }


    public static LinkedHashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hashMap) {

        // Create a List from the HashMap entries
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the list based on values
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Create a new LinkedHashMap to maintain the order
        LinkedHashMap<Integer, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
