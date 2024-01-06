package practice.custom.math;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * First break down the number with subpart
 * Prime number calculation helps to find the list of
 */

public class GcdCalculation {

    public static void main(String[] args) {
        int a = 6;
        int b = 24;
//        int[] numBreakDown_1 = numBreakDown(a);
//        int[] numBreakDown_2 = numBreakDown(b);
//        int result = calculateGCD(numBreakDown_1, numBreakDown_2);
        int result = calculateGCD(a, b);
        System.out.println(result);
    }

    static int calculateGCD(int n1, int n2) {
        while (n2 != 0) {
            int reminder = n1 % n2;
            n1 = n2;
            n2 = reminder;
        }
        return n1;
    }

    static int calculateGCD(int[] n1, int[] n2) {
        int result = 1;
        if (n1.length < n2.length) {
            int[] a = n1;
            n1 = n2;
            n2 = a;
        }

        int jCounter = 0;
        for (int k : n2) {
            int j = jCounter;
            for (; j < n1.length; j++) {
                if (k == n1[j]) {
                    result *= n1[j];
                    jCounter++;
                    break;
                }
            }
        }
        return result;
    }

    static int[] numBreakDown(int num) {
        int copyOfNum = num;
        List<Integer> arrayList = new ArrayList<>();
        int count = 0;

        int[] primeNumberBetweenTwoNumbers = PrimeNumberCalc.primeNumberBetweenTwoNumbers(2, num);

        while (copyOfNum > 1) {
            int divisor = 0;

            for (int primeNum : primeNumberBetweenTwoNumbers) {
                if (copyOfNum % primeNum == 0) {
                    divisor = primeNum;
                    break;
                }
            }
            arrayList.add(divisor);
            copyOfNum /= divisor;
            count++;
        }
        int[] arr = arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        assertionOfBreakDown(count, arr, num);

        return arr;
    }

    static void assertionOfBreakDown(int count, int[] nums, int expectedNum) {
        int actualNum = 1;
        for (int i = 0; i < count; i++) {
            actualNum *= nums[i];
        }
        if (actualNum != expectedNum) {
            String format = printMessageFormat(actualNum, expectedNum);
            throw new RuntimeException("Algorithm is not valid, " + format);
        }
    }

    static String printMessageFormat(Object... args) {
        return new MessageFormat("Actual num: {0}, expected num: {1}").format(args);
    }
}
