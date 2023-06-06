package practice.markerInterface;

import java.util.Objects;

class TestObj implements Cloneable{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public TestObj2 clone() {
        try {
            return (TestObj2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class TestObj2{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    @Override
//    public TestObj2 clone() {
//        try {
//            return (TestObj2) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}

public class CloneableInterfaceExample {
    public static void main(String[] args) {
        TestObj t1 = new TestObj();
        t1.setMessage("hello");
        TestObj2 t2 = t1.clone();
        t2.setMessage("bye");
        System.out.println(t1.getMessage());
        System.out.println(t2.getMessage());

//        TestObj t2 = t1.clone();
//        TestObj t3 = t1;
//        t3.setMessage("bye");
//        System.out.println(t1 == t2);
//        System.out.println(t1 == t3);
//        System.out.println(t1.getMessage() == t2.getMessage());
//        System.out.println(t1.getMessage() == t3.getMessage());
//        System.out.println(t2.getMessage());
    }
}
