package practice.io;

import java.io.File;
import java.io.IOException;

public class FileCRUD {

    // working directory
    public static String getWorkingDirectory() {
        return System.getProperty("user.dir");
    }

    public static File prepareAFile(String directory, String fileName) {
        return new File(directory + File.separator + fileName);
    }

    public static String createAFile(String directory, String fileName) throws IOException {
        File file = new File(directory + File.separator + fileName);
        file.createNewFile();
        System.out.println("File Path: " + file.getPath());
        return file.getPath();
    }

    public static String createDirectory(String directory) {
        File dir = new File(directory);
        dir.mkdir();
        String path = dir.getPath();
        System.out.println("New Directory path: " + path);
        return path;
    }

    public static void renameFile(File oldFile, File newFile) {
        boolean result = oldFile.renameTo(newFile);
        if(result){
            System.out.println("new file path: " + newFile);
        }else{
            System.out.println("failed to rename");
        }
    }

    public static void delete(File file) {
        boolean result = file.delete();
        if (result) {
            System.out.println("file deleted");
        }else{
            System.out.println("faied to delete " + file);
        }
    }
}

/**
 * DriverClass
 */
class DriverClass {

    public static void main(String[] args) throws IOException {
        // String directory = FileCRUD.getWorkingDirectory();
        // System.out.println(directory);

        // lets create a new Directory
        String directory = FileCRUD.createDirectory("hello1");

        // lets create a new file
        String fileName = "hello.txt";
        String path = FileCRUD.createAFile(directory, fileName);

        // lets rename a file
        File newFile = FileCRUD.prepareAFile(directory, "new.txt");
        FileCRUD.renameFile(new File(path), newFile);

        // lets delete a file
        FileCRUD.delete(new File(directory)); // delete failed beacause of non-empty folder
        if (true) {
            FileCRUD.delete(newFile);
        }
        
        FileCRUD.delete(new File(directory)); // delete success, now folder is empty
    }
}