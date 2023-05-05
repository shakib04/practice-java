package practice.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterExample {

    private static final String commonPath = "src/main/java/practice/io";

    public static void exampleOfReader() {
        Reader reader = null;
        try {
            reader = new FileReader(commonPath + "/input.txt");
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void exampleOfWriter() {
        Writer writer;
        String text = "Nuxt.js is a free and open source JavaScript library based on Vue.js, Node.js, Webpack and Babel.js. Nuxt is inspired by Next.js, which is a framework of similar purpose, based on React.js. The framework is advertised as a Meta-framework for universal applications. Wikipedia";
        try {
            writer = new FileWriter(commonPath + "/output2.txt");
            writer.write(text);
            writer.flush();
            writer.close();
            System.out.println("ReaderWriterExample.exampleOfWriter()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //ReaderWriterExample.exampleOfReader();
        ReaderWriterExample.exampleOfWriter();
    }
}
