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
       //System.out.println(Pattern.matches("[{\\d+}]", "hello {2}, how are{1} you "));


        pattern = Pattern.compile("[{\\d+}]");
        matcher = pattern.matcher("hello {2}, how are{1} you ");
        while (matcher.find()) {
            //System.out.println(matcher.repl());
        }

        System.out.println("hello {2}, how are {1} you. I am {1} ".replace("{1}", "good"));

    }
}
