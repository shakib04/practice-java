package practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExampleOfPredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(9));
        System.out.println(isEven.test(988888889));

        List<Integer> numbers = Arrays.asList(2,4,5,22,32,22,2);
        numbers.stream().filter(isEven).forEach(x -> System.out.println("Even: "+x));

    }
}
