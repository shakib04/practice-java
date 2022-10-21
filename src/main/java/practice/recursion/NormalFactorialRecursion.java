package practice.recursion;

import practice.recursion.tail.TailCall;
import practice.recursion.tail.TailCalls;

import static practice.recursion.tail.TailCalls.call;

public class NormalFactorialRecursion {

    private int factorial(int n) {
        if (n == 1) return n;
        else if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    public static TailCall factorialTailRec(final int factorial, final int number) {
        if (number == 1)
            return TailCalls.done(factorial);
        else
            return call(() -> factorialTailRec(factorial * number, number - 1));
    }

    public static void main(String[] args) {
        NormalFactorialRecursion recursion = new NormalFactorialRecursion();
        //int result = recursion.factorial(5);
        //System.out.println(result);

        System.out.println(NormalFactorialRecursion.factorialTailRec(1, 5).invoke().toString());
    }
}
