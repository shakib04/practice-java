package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.javatpoint.com/java-regex

public class MatchRegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("..");
        Matcher matcher = pattern.matcher("as");

        //System.out.println(Pattern.matches("[amn]", "nn"));
       //System.out.println(Pattern.matches("[amn]+", "an"));
       //System.out.println(Pattern.matches("\\S+", " "));
       System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "amnnj"));


    }
}
