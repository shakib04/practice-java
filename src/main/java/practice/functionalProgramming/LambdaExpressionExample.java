package practice.functionalProgramming;

// It has introduced in java 8.
// They provide us with an easier way to work with interfaces they have only got one method.

// every lambda expression has 03 parts.
//      a) argument b) arrow token c) body

public class LambdaExpressionExample {

    public static void main(String[] args) {
        // approach-1 : Pass a class constructor which implements Runnable interface
//        new Thread(new CodeToRun()).start();

        // approach-2 : Pass an anonymous class which implements Runnable interface
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();

        // approach-3: Lambdas
        new Thread(() -> System.out.println("Printing from the Runnable"))
                .start();

    }
}

class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from the Runnable method");
    }
}
