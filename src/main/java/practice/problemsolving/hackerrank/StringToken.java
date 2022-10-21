package practice.problemsolving.hackerrank;

import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().equals("")) {
            System.out.println(0);

        } else {
            String[] strings = s.trim().split("[ !,?._'@]+");

            System.out.println(strings.length);
            for (String s1 : strings) {
                System.out.println(s1);
            }
        }
        scan.close();
    }
}


