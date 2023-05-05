package practice.comparatorExample;

import java.util.Arrays;
import java.util.List;

public class SortingAscOrDesc {



    public static void main(String[] args) {
        //SortingAscOrDesc sortingAscOrDesc = new SortingAscOrDesc();

        List<Integer> integerList = Arrays.asList(5,3,5,2,654,2,532,214);
        integerList.sort((i1, i2) -> i2 - i1);
        System.out.println(integerList);
    }
}
