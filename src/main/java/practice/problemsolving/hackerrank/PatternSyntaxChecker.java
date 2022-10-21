package practice.problemsolving.hackerrank;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int count = 1;
        while(testCases>0){
            if (testCases == count) break;
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException patternSyntaxException){
                System.out.println("Invalid");
            }
            count++;
        }
    }
}
