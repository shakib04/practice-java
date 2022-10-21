package practice.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        do {
            line = bufferedReader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
        }while (!"QUIT".equals(line));
    }
}
