package practice.autoclosable;

import java.util.Scanner;

public class AutoClosableImpl implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String s = scanner.next();
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
