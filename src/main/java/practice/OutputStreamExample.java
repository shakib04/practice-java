package practice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class OutputStreamExample {

    public static void main(String[] args) {
        FileOutputStream out = null;
        String resourcePath = ClassLoader.getSystemClassLoader().getResource("").getPath();
        //resourcePath= OutputStreamExample.class.getResource("").getPath();
        File file = new File(resourcePath + "new-file-out.txt");
        try {
            String message = "hello! this is a dummy text";
            out = new FileOutputStream(file);
            out.write(message.getBytes());

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.writeTo(out);
            System.out.println(Arrays.toString(baos.toByteArray()));

            out.close();
            System.out.println(file.exists());
            //file.createNewFile();
        } catch (IOException e) {

        }
        System.out.println(resourcePath);
    }
}
