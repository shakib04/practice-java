package practice.custom.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberCalc {

    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        int[] ints = primeNumberBetweenTwoNumbers(a, b);
        System.out.println(Arrays.toString(ints));
    }

    static int[] primeNumberBetweenTwoNumbers(int n1, int n2) {
        if (n1 > n2) {
            throw new IllegalArgumentException("n1 should be less than n2");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = n1; i < n2; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
