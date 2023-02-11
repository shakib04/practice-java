package practice.serialization;

import java.io.*;

public class SerializablePractice {
}

class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Persist{
    public static void main(String[] args) {
        try{
            Student s1 = new Student(211, "ravi");
            FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s1);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("success");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


class Depersist{
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("f.txt")
            );
            Student s = (Student) in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}