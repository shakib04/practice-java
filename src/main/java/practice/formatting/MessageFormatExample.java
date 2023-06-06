package practice.formatting;

import java.text.MessageFormat;

public class MessageFormatExample {

    public static String test(){
        String name = "John Doe";
        //return MessageFormat.format("Hello, \"{0}\"!", name);
        return MessageFormat.format("Hello, ''{0}''!", name);
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
