package practice.reflection;

public class BasicClassExample {
    private String name;
    private int age;

    public BasicClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static void dummy(){
        System.out.println("call dummy method");
    }

    private void ageAfterYears(int years){
        System.out.printf("age after %d years is %d\n", years, this.age + years);
    }
}
