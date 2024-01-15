package practice.leetcode.easy;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagramUsingMergeSort(s, t));
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramV3(s, t));
    }

    static boolean isAnagramUsingMergeSort(String s, String t) {
        int[] c1 = new int[s.length()];
        int[] c2 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c1[i] = s.charAt(i);
            c2[i] = t.charAt(i);
        }

        MergeSort.sort(c1, 0, c1.length - 1);
        MergeSort.sort(c2, 0, c2.length - 1);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isAnagramV3(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] store = new int[26];
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int j : store) {
            if (j != 0) return false;
        }
        return true;
    }

    static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Character keyOfFirst = s.charAt(i);
            first.put(keyOfFirst, first.getOrDefault(keyOfFirst, 0) + 1);

            Character keyOfSecond = t.charAt(i);
            second.put(keyOfSecond, second.getOrDefault(keyOfSecond, 0) + 1);
        }

        for (Character key : first.keySet()) {
            if (!first.get(key).equals(second.getOrDefault(key, 0))) return false;
        }
        return true;
    }

    static class MergeSort {

        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        static void merge(int[] arr, int l, int m, int r) {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            // Create temp arrays
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            // Merge the temp arrays

            // Initial indices of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        static void sort(int[] arr, int l, int r) {
            if (l < r) {

                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }

        // A utility function to print array of size n
        static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};

            System.out.println("Given array is");
            printArray(arr);
            sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array is");
            printArray(arr);
        }
    }
}
