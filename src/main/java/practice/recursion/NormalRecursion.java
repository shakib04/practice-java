package practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class NormalRecursion {

    public static void main(String[] args) {
        //System.out.println(recursion(4, new ArrayList<>()));
        //System.out.println(recursion2(4, new ArrayList<>()));
        System.out.println(fun(4, 4));
    }

    private static List recursion(int x, List<Integer> integers) {
        integers.add(x);
        if(x > 0) {
            x = x - 1;
            return recursion(x, integers);
        }
        return integers;
    }

    private static int fun(int x, int y){
        if (y==0){
            return 0;
        }
        System.out.println(x);
        return (x + fun(x, y - 1));
    }

    private static List<Integer> recursion2(int x, List<Integer> integers) {
        integers.add(x);
        if(x > 0) {
            x = x - 1;
            return recursion2(x, integers);
            //System.out.println(x);
        }
        return integers;
    }
}
