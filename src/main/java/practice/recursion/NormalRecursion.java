package practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class NormalRecursion {

    public static void main(String[] args) {
        System.out.println(recuresion(2));
    }

    private static List recuresion(int x) {
        List<Integer> integers = new ArrayList<>();
        integers.add(x);
        if(x > 0) {
            x = x - 1;
            return recuresion(x);
        }
        return integers;
    }
}
