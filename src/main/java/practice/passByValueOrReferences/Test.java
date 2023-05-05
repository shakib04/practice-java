package practice.passByValueOrReferences;

public class Test {

    public static void main(String[] args) {

        Balloon red = new Balloon("Red"); // memory reference = 50
        Balloon blue = new Balloon("Blue"); // memory reference = 100

        swap(red, blue);
        System.out.println("After the swap method executes:");
        System.out.println("`red` color value = " + red.getColor());
        System.out.println("`blue` color value = " + blue.getColor());

        changeValue(blue);
        System.out.println("After the changeValue method executes:");
        System.out.println("`blue` color value = " + blue.getColor());

    }

    // Generic swap method
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }

    private static void changeValue(Balloon balloon) { // balloon = 100
        //balloon.setColor("Red"); // balloon = 100
        balloon = new Balloon("Green"); // balloon = 200
        balloon.setColor("Blue"); // balloon = 200
    }

}
