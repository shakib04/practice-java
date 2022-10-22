package practice.io;

import java.io.File;
import java.io.IOException;

public class FileCRUD {

    // working directory
    public static String getWorkingDirectory() {
        return System.getProperty("user.dir");
    }

    public static boolean createAFile(String directory, String fileName) throws IOException{
        File file = new File(directory + File.separator + fileName);
        boolean result = file.createNewFile();
        System.out.println("File Path: " + file.getPath());
        return result;
    }

    public static String createDirectory(String directory) {
        File dir = new File(directory);
        dir.mkdir();
        String path = dir.getPath();
        System.out.println("New Directory path: " + path);
        return path;
    }
}

/**
 * DriverClass
 */
class DriverClass {

    public static void main(String[] args) throws IOException {
        //String directory = FileCRUD.getWorkingDirectory();
        //System.out.println(directory);

        // lets create a new Directory
        String directory = FileCRUD.createDirectory("hello1");
        
        // lets create a new file
        System.out.println(FileCRUD.createAFile(directory, "hello.txt"));
    }
}