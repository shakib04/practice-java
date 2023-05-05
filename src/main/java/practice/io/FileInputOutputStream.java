package practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {
    public static void exampleOfInputStream() {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/main/java/practice/io/input.txt");
            int c;
            while ((c = fin.read()) != -1) {
                //System.out.println(c + ", ");
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.err.println("could not read file");
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (Exception e) {
                    System.err.println("could close input stream");
                }
            }
        }
    }

    public static void exampleOfOutputStream() {
        String destFile = "src/main/java/practice/io/output.txt";
        String data = "When you run the jar, the application will try to load properties from a file called test.properties that is located in the application working directory.";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("FileInputOutputStream.exampleOfOutputStream()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Driver
 */
class Driver {
    public static void main(String[] args) {
        FileInputOutputStream.exampleOfOutputStream();
    }
}