package practice.annotationExample;

public class TestStringToIntegerConverter {

    @StringToIntegerConverter
    public String test(){
        String abc = "33323";
        return abc;
    }

    public static void main(String[] args) {
        System.out.println(new TestStringToIntegerConverter().test().getClass());
    }
}
