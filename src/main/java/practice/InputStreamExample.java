package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class InputStreamExample {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            URL resource = ClassLoader.getSystemClassLoader().getResource("new-file.txt");
            in = new FileInputStream(resource.getPath());
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {

                if (in != null) {
                    in.close();
                }
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }
    }
}
