package practice.streamApiExample;

import java.util.*;

public class ExternalAndInternalIterationsExample {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 45);
        // normal for loop
//        for (int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i));
//        }

        // iterator mainly used for modification
//        Iterator<Integer> iterator = values.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // enhanced for loop
//        for (int value: values){
//            System.out.println(value);
//        }

        // stream api
        //values.forEach(i -> System.out.println(i));

        Collection<Integer> tt = new HashSet<>();
        int value = 2;
        values.stream().forEach(x -> {
            tt.add(x);
        });



    }
}
