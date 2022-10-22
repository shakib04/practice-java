package practice.io;

import java.io.File;

public class FileCRUD {

    // working directory
    public static String getWorkingDirectory() {
        return System.getProperty("user.dir");
    }

    public static File createAFile(String directory, String fileName) {
        return new File(directory + File.pathSeparator + fileName);
    }
}

/**
 * DriverClass
 */
class DriverClass {

    public static void main(String[] args) {
        String directory = FileCRUD.getWorkingDirectory();
        FileCRUD.createAFile(directory, "hello.txt");
    }
}