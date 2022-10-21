package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";

        String[] strings = s.split("[ !,?._'@]+");

        System.out.println(strings.length);
        for (String s1: strings){
            System.out.println(s1);
        }
    }
}
