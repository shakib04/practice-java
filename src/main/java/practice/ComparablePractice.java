package practice;

import java.util.*;

class Person implements Comparable<Person>, Comparator<Person> {
    int id;

    String name;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person person) {
        if (this.id < person.id) {
            return 1;
        } else if (this.id > person.id) {
            return -1;
        } else {
            return 0;
            //throw new RuntimeException("Id cannot be same, id = " + person.id);
        }
    }

    @Override
    public String toString() {
        return "Student{id=" +
                this.id +
                ", name=" +
                this.name +
                "}";
    }

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.id > person2.id) return 1;
        else if (person1.id < person2.id) return -1;
        else return 0;
    }
}



public class ComparablePractice {

    public static void main(String[] args) throws Exception {
        Person person1 = new Person(2);
        Person person2 = new Person(20);
        Person person3 = new Person(1);
        Person duplicatePerson = new Person(1);


//        System.out.println(person1.compareTo(person2));
//        System.out.println(person1.compareTo(person3));
//        System.out.println(person3.compareTo(duplicatePerson));

        List<Person> kk = new ArrayList<>();
        kk.add(person1);
        kk.add(person2);
        kk.add(person3);
        kk.add(duplicatePerson);

        //Collections.sort(kk);
        System.out.println(kk);

        System.out.println(new Person(-333).compare(person3, duplicatePerson));
    }

}
