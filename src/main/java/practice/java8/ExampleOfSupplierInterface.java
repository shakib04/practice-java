package practice.java8;

import java.util.*;
import java.util.function.Supplier;

public class ExampleOfSupplierInterface {
    public static void main(String[] args) {
        int number = 20;
        Supplier supplier = () -> {
            Set<Integer> integers = new HashSet<>();
            for (int i = 0; i < number; i++) {
                Random random = new Random();
                integers.add(random.nextInt(number));
            }
            System.out.println(integers);
            return integers;
        };

        System.out.println(supplier.get().toString());

        // return dummy data if not found (stream)
        List<String> stringList = Arrays.asList();
        System.out.println(stringList.stream().findAny().orElseGet(() -> "dummy"));
    }
}
