package practice.problemsolving.codeforces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * F. Keyboard Design @url(https://codeforces.com/problemset/problem/1739/F)
 * time limit per test4 seconds
 * memory limit per test1024 megabytes
 * inputstandard input
 * outputstandard output
 * Monocarp has a dictionary of n words, consisting of 12 first letters of the Latin alphabet. The words are numbered from 1 to n. In every pair of adjacent characters in each word, the characters are different. For every word i, Monocarp also has an integer ci denoting how often he uses this word.
 *
 * Monocarp wants to design a keyboard that would allow him to type some of the words easily. A keyboard can be denoted as a sequence of 12 first letters of the Latin alphabet, where each letter from a to l appears exactly once.
 *
 * A word can be typed with the keyboard easily if, for every pair of adjacent characters in the word, these characters are adjacent in the keyboard as well. The optimality of the keyboard is the sum of ci over all words i that can be typed easily with it.
 *
 * Help Monocarp to design a keyboard with the maximum possible optimality.
 *
 * Input
 * The first line contains one integer n (1≤n≤1000) — the number of words.
 *
 * Then, n lines follow. The i-th of them contains an integer ci (1≤ci≤105) and a string si (2≤|si|≤2000) denoting the i-th word. Each character of si is one of 12 first letters of Latin alphabet, in lowercase. For every j∈[1,|si|−1], the j-th character of si is different from the (j+1)-th one.
 *
 * Additional constraint on the input: ∑i=1n|si|≤2000.
 *
 * Output
 * Print a sequence of 12 first letters of the Latin alphabet, where each letter from a to l appears exactly once, denoting the optimal keyboard. If there are multiple answers, you may print any of them.
 *
 * Examples
 * input
 * 3
 * 7 abacaba
 * 10 cba
 * 4 db
 * output
 * hjkildbacefg
 *
 * input
 * 1
 * 100 abca
 * outputCopy
 * abcdefghijkl
 */


// prepare a sequential, if character already exits just continue, prepare a new string;
// track missing character in letters list, prepare a new string
// concat two new string (sequential + missing) = result
// find pairs

public class KeyboardDesign_1739 {

//    private static InputData[] sortByFrequent(InputData[] inputData){
//        for
//    }

    private static void solution(InputData[] inputData){
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};
        String missing = "";
        String sequential = "";
        for (int i = 0; i < inputData.length; i++) {
            String word = inputData[i].getWord();
            for (int j = 0; j < word.length(); j++) {
                String letter = word.charAt(j)+"";
                if (!sequential.contains(letter)){
                    sequential = sequential + letter;
                }
            }
        }

        // missing list
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            if (!sequential.contains(letter)){
                missing += letter;
            }
        }

        System.out.println(sequential + missing);
        System.out.println("hjkildbacefg");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        InputData[] inputData = new InputData[testCase];
        for (int i = 0; i < testCase; i++) {
            InputData inputData1 = new InputData();
            inputData1.setFrequentUse(scanner.nextInt());
            inputData1.setWord(scanner.next());
            inputData[i] = inputData1;
        }
        //System.out.println(s);
//        InputData[] inputData = new InputData[]{
//                new InputData(100, "abca")
//        };
//        inputData = new InputData[]{
//            new InputData(7, "abacaba"),
//            new InputData(10, "cba"),
//            new InputData(4, "db"),
//        };
        Arrays.sort(inputData, Comparator.comparingInt(InputData::getFrequentUse).reversed());
        solution(inputData);
    }
}

class InputData{

    private int frequentUse;
    private String word;

    public InputData() {
    }

    public InputData(int frequentUse, String word) {
        this.frequentUse = frequentUse;
        this.word = word;
    }

    public int getFrequentUse() {
        return frequentUse;
    }

    public void setFrequentUse(int frequentUse) {
        this.frequentUse = frequentUse;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
