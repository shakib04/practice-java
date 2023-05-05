package practice.staticKeyword;

/**
 * in static method's body, non-static method cannot be called without creating object
 */

public class JavaStaticPractice {

    public static void main(String[] args) {
        test();
    }

    void testNonStatic(){
        test();
    }
    static void test(){

    }
}

class JavaStaticTestV2{
    void testNonStatic(){

    }

    void testNonStatic2(){

    }
}
