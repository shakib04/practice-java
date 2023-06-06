package practice.stringOperations;

import java.text.MessageFormat;
import java.util.MissingFormatArgumentException;

public class VarArgsExample {

    static void test(String... varArgs){
//        for (String s: varArgs){
//            System.out.println(s);
//        }
        try {
            String formatted = String.format("hello %s, how are you? %s", varArgs);
            System.out.println(formatted);
        }catch (MissingFormatArgumentException ex){
            System.out.println(ex.getMessage());
            System.out.printf("%n---ERROR----!!!!argument missing!!!!---%n");
        }
    }

    static void test2(int argsLength, String... varArgs) throws Throwable {
        if (argsLength != varArgs.length){
            throw new Throwable("length is not same");
        }
    }

    static void test3(String... varArgs) throws Throwable {
        System.out.println(varArgs.length);
        if (varArgs.length > 0){
            System.out.println(varArgs[0]);
        }
    }



    public static void main(String[] args) throws Throwable {
        //test( "test");
        //test("test2", "test3");
        //test("test2", "test3", "test4");
        //test(new String[]{"3", "55"});
        //test(new String[]{"3", "55", "65"});
        //System.out.println("good boy {}".replace("{}", "%s"));
        test3();
        test3("22");
        System.out.println(MessageFormat.format("test {2}", 20, 9, 6));
        //test3(null);
        throw new RuntimeException(MessageFormat.format("test {2}", 20, 9, 6));
    }
}
