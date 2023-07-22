package practice.interfaceExample;


public interface ITest {

    int testVariable = 2;

    default void test(){
        System.out.println("test interface");
    }


    static int testStatic(){
        System.out.println("static test interface");
        return 1;
    }
}

interface ITest2 extends ITest{

    int test = ITest.testStatic();

    default void test(){
        System.out.println("test interface v2");
    }
}

class Test implements ITest, ITest2{

//    public void test() {
//        System.out.println("test class");
//    }
}

class Main{
    public static void main(String[] args) {
        new Test().test();
        ITest.testStatic();
        System.out.println(ITest2.test);
    }
}



// third rule example //


/**
 * If a class implements an interface which has a default method named ‘show’
 * and extends a class which has a method with the same name then the class method will get priority.
 * This is called the 3rd rule in java.
 */

interface IThirdEx{
    default void show(){
        System.out.println("call from IThirdEx");
    }
}

class ThirdEx{
    public void show(){
        System.out.println("call from ThirdEx");
    }
}

class ThirdExImpl extends ThirdEx implements IThirdEx{

}

class Main3{
    public static void main(String[] args) {
        new ThirdEx().show();
    }
}

// cannot override object method in Interface as default method

interface ITestObject{
//    default boolean equals(Object o){
//        return false;
//    }
    // it produces error: Default method 'equals' overrides a member of 'java.lang.Object'
}

