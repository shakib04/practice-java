package practice.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\Learning Spring\\PracticeJava\\src\\main\\java\\practice\\io\\StandardIOExample.java");

        if (file.exists()){
            System.out.println("file exists");
        }else {
            System.out.println("not exists");
        }

        if (file.isFile()){
            System.out.println("it is a file");
        }else {
            System.out.println("not a file");
        }
        //System.out.println(file);

        String pwd = System.getProperty("user.dir");
        String newDir = pwd + File.pathSeparator + "helloworld";
        File file1 = new File(newDir);
        System.out.println(file1);
        //newDir.


        try {
            File file02 = new File("E:\\Learning Spring\\PracticeJava\\src\\main\\java\\practice\\io\\simple.java");
            //file02.createNewFile();
            System.out.println("thread stared sleeping");
            //Thread.sleep(10000);
            System.out.println("thread has wake up");
            file02.delete();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
