package practice.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorTestPojo implements Comparator<ComparatorTestPojo> {
    String name;
    LocalDate creationDate;

//    public ComparatorTestPojo() {
//    }

    public ComparatorTestPojo(String name, LocalDate creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    @Override
    public int compare(ComparatorTestPojo o1, ComparatorTestPojo o2) {
        return o1.name.length() - o2.name.length();
    }

    @Override
    public String toString() {
        return "ComparatorTestPojo{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}



public class ComparatorExample {
    public static void main(String[] args) {
        List<ComparatorTestPojo> array = new ArrayList<>();
        array.add(new ComparatorTestPojo("shakib", LocalDate.now()));
        array.add(new ComparatorTestPojo("rakib", LocalDate.now()));
        array.add(new ComparatorTestPojo("tamim iqbal", LocalDate.now()));
        array.add(new ComparatorTestPojo("mashrafee", LocalDate.now()));

        //array.sort(new ComparatorTestPojo().compare());

        //array.sort(new ComparatorTestPojo(null, null));
        //array.sort((x, y) -> x.name.length() - y.name.length());
        array.sort(Comparator.comparingInt(x -> x.name.length()));
        System.out.println(array);
    }
}
