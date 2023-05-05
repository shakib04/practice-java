package practice.mutableAndUnmutable;

final class Address{
    int roadNo;
    int houseNo;
    String areaName;

    public Address(int roadNo, int houseNo, String areaName) {
        this.roadNo = roadNo;
        this.houseNo = houseNo;
        this.areaName = areaName;
    }
}

class Student{
    int age;
    Address address;
}

public class TestMutable {

    static void testMethod(String s, Student student, Integer integer){
        String string = new String("change");
        s = string;
        student.age = 23;
        integer = 12;
        System.out.println("hash value of string from testMethod: " + s.hashCode());
        System.out.println("hash value of student from testMethod: " + student.hashCode());
    }

    public static void main(String[] args) {
        String s = "test";
        Integer integer = 22;
        TestMutable testMutable = new TestMutable();

        Address address = new Address(1,1,"niketan");

        Student student = new Student();
        student.age = 20;
        student.address = address;

        //address = new Address(1,1,"gulshan");
        address.areaName = "Gulshan";

        System.out.println(student.address.areaName);


        testMutable.testMethod(s, student, integer);
        //System.out.println(s);
        System.out.println("hash value of string from main method: " + s.hashCode());
        System.out.println("hash value of student from main method: " + student.hashCode());
        System.out.println(student.age);
    }
}
