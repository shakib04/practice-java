package practice.equalsCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import practice.javaMasterClass.ArrayChallenge;

public class ObjectsEqualChecking {

    public static void main(String[] args) {
//        System.out.println(Objects.equals(" ".trim(), ""));
//        System.out.println(Objects.equals(null, ""));
        List<String> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        System.out.println(Objects.equals(s1, s2));
        //System.out.println(Objects.equals(new HashMap<Integer, Integer>(), new HashMap<String, String>()));
    }
}
