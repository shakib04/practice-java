package practice.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class bb{

}

class test extends bb{

    public void ss(){

    }
}

public class TestAbstractClass {


    public List<String> myList(){
        final List<String> dd = new ArrayList<>();
        dd.add("dd");
        modifiedList(dd);
        return dd;
    }

    public void modifiedList(List<String> ss){
        ss = new ArrayList<>();
        ss.add("dd2");
    }

    public static void main(String[] args) {

        System.out.println(new TestAbstractClass().myList()
                .stream()
                .collect(Collectors.toMap(x -> x, x -> x)));
    }
}
