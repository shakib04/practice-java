package practice.functionalProgramming;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

    public static void test(){
        System.out.println("call from test");
    }

    public static void main(String[] args) {
        Function<Void, Void> ss = MethodReference::test;
        //ss.apply(null);
        Supplier<Void> supplier = MethodReference::testOfSupplier;
        supplier.get();
    }

    private static Void testOfSupplier() {
        System.out.println("test of supplier");
        return null;
    }

    private static Void test(Void unused) {
        System.out.println("call from test");
        return unused;
    }
}
