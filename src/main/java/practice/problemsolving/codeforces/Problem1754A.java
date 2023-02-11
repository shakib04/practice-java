package practice.problemsolving.codeforces;//package practice.codeforces;

import java.util.Scanner;

/**
 * 5
 * 4
 * QQAA
 * 4
 * QQAQ
 * 3
 * QAA
 * 1
 * Q
 * 14
 * QAQQAQAAQQQAAA
 *
 * Problem link: https://codeforces.com/problemset/problem/1754/A
 */
public class Problem1754A {

    private static String solution(String string) {
        int remainingQuestion = 0;

        for (int i = 0; i < string.length(); i++) {
            final char c = string.charAt(i);
            if (c == 'Q'){
                remainingQuestion++;
            }else if(c == 'A' && remainingQuestion > 0) {
                    remainingQuestion--;
            }
        }
        if (remainingQuestion > 0)
            return "No";
        else return "Yes";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int stringLen = scanner.nextInt();
            String string = scanner.next();
            System.out.println(solution(string));
        }

//      System.out.println(solution("QAQAQAAQ"));
//        System.out.println(solution("QAAQQQAA"));
//        System.out.println(solution("QAAQQQAA"));
//        System.out.println(solution("QAA"));
//        System.out.println(solution("Q"));
//        System.out.println(solution("QAQQAQAAQQQAAA"));
    }
}


/**
 * Yes
 * No
 * Yes
 * No
 * Yes
 *
 *
 *
 * check question, if one answer found then wait for next question. if question answer found then ok.
 *  QAQAAQQAAQQAAAAAAAA
 *  QAQAQQAQQAAA
 *
 * // problem 1: how I know what question's answer which one represents?
 * // solution:
 * //problem 2: how to track
 *
 *
 */