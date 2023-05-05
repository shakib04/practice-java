package practice.functionalProgramming;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
//        new FPImpl().printTest();

        // anonymous class
//        new FP(){
//            @Override
//            public void printTest() {
//                System.out.println("Test");
//            }
//        }.printTest();


        FPTest fpTest = new FPTest();
        fpTest.test(() -> System.out.println("test"));

    }
}

class FPImpl implements FP{
    @Override
    public void printTest() {
        System.out.println("Test");
    }
}

class FPTest{
    void test(FP fp){

    }
}

@FunctionalInterface
interface FP{
    void printTest();
}
