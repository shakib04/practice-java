package practice.java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class ExampleOfConsumerInterface<T> {

    public static void main(String[] args) {
        // without Consumer Interface
        Functional functional = (s) -> System.out.println(s + "Test");
        functional.concatTest("hh");

        // using Consumer Interface
        Consumer consumer = (s)-> System.out.println(s);
        consumer.accept("ttt");


        //print a list using consumer
        System.out.println("printing list:-");
        //Arrays.asList(2,4,5,22,32,22,2,null).forEach(consumer);
        Arrays.asList(2,4,5,22,32,22,2).forEach(s-> System.out.println(s));
    }
}

class TestConsumer{


}


interface Functional{
    void concatTest(String s);
}