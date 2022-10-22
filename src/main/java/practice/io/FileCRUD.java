package practice.io;

import java.io.File;
import java.io.FileFilter;
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
        if (result) {
            System.out.println("new file path: " + newFile);
        } else {
            System.out.println("failed to rename");
        }
    }

    public static void delete(File file) {
        boolean result = file.delete();
        if (result) {
            System.out.println("file deleted");
        } else {
            System.out.println("faied to delete " + file);
        }
    }

    public static void delete(File[] files) {
        for (File file : files) {
            delete(file);
        }
    }

    public static File[] getListOfFiles(String directory, boolean printFilePath) {
        File home = new File(directory);
        File[] files = home.listFiles();

        if (printFilePath) {
            System.out.println("List of files and their paths");
            for (File file : files) {
                System.out.println(file.getPath());
            }
        }

        return files;
    }

    public static void findFilesByExtention(String directory, String extention) {
        File home = new File(directory);

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String pathName = pathname.getName();
                if (pathName.endsWith(extention)) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        File[] files = home.listFiles(fileFilter);
        System.out.println("List of files with " + extention);
        for (File file : files) {
            System.out.println(file.getPath());
        }
    }
}

/**
 * DriverClass
 */
class DriverClass {

    /**
     * @param args
     * @throws IOException
     */
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
        // FileCRUD.delete(new File(directory)); // delete failed beacause of non-empty
        // folder
        if (false) {
            FileCRUD.delete(newFile);
        }

        // FileCRUD.delete(new File(directory)); // delete success, now folder is empty

        // create batch file (3)
        for (int i = 1; i <= 3; i++) {
            FileCRUD.createAFile(directory, "text-" + i + ".txt");
        }

        // get list of file
        File[] files = FileCRUD.getListOfFiles(directory, true);

        // file batch delete
        // FileCRUD.delete(files);

        // lets filter files
        FileCRUD.findFilesByExtention(FileCRUD.getWorkingDirectory(), ".txt");

    }
}