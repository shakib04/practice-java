package practice.problemsolving;

import practice.StopWatch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String s = "I’ve built the course that I would have wanted to take when I was learning Elixir and Phoenix. A course that explains the concepts and how they’re implemented in the best order for you to learn and deeply understand them.";
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(s);
        }
        s = stringBuilder.toString();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stringReverse02(s);
        stopWatch.stop();
        System.out.println("time taken by 01: " + stopWatch.getElapsedTimeInMillis());

        stopWatch.start();
        stringReverse01(s);
        stopWatch.stop();
        System.out.println("time taken by 02: " + stopWatch.getElapsedTimeInMillis());

        stopWatch.start();
        stringReverse03(s);
        stopWatch.stop();
        System.out.println("time taken by 03: " + stopWatch.getElapsedTimeInMillis());

        stopWatch.start();
        stringReverse04(s);
        stopWatch.stop();
        System.out.println("time taken by 04: " + stopWatch.getElapsedTimeInMillis());
    }

    private static void stringReverse01(String s) {
        System.out.println("---- Method 01 ---");
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            reverse.insert(0, s.charAt(i));
        }
//        System.out.printf("normal string: %s\n", s);
//        System.out.printf("reverse string: %s\n", reverse);
    }

    private static void stringReverse02(String s) {
        System.out.println("---- Method 02 ---");
        char[] sInArray = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char a = sInArray[i];
            char b = sInArray[s.length() - i - 1];
            sInArray[i] = b;
            sInArray[s.length() - i - 1] = a;
        }

//        System.out.printf("normal string: %s\n", s);
//        System.out.printf("reverse string: %s\n", new String(sInArray));
    }

    private static void stringReverse03(String s) {
        System.out.println("---- Method 03 ---");
        String[] array = s.split("");
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);

//        System.out.printf("normal string: %s\n", s);
//        System.out.printf("reverse string: %s\n", String.join("", list));
    }

    private static void stringReverse04(String s) {
        System.out.println("---- Method 04 ---");
        StringBuilder temp = new StringBuilder(s);
        temp.reverse();

//        System.out.printf("normal string: %s\n", s);
//        System.out.printf("reverse string: %s\n", temp);
    }
}
