package practice.java.test;

public class TestJava {


    public static void main(String[] args) {
        TestJava testJava = new TestJava();
        testJava.test("test for String");
        testJava.test((Object) "test for Object");
        testJava.test(2);
    }

    private void test(String test) {
        System.out.println(test);
    }

    private void test(Object test) {
        System.out.println(test);
    }
}
