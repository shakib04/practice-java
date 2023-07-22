package practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        BasicClassExample basicClassExample = new BasicClassExample("test", 1);
        Field[] fields = basicClassExample.getClass().getDeclaredFields();

        // change name field value through reflection
        System.out.println("after change name field value through reflection");
        for (Field field : fields) {
            if (field.getName().equals("name")){
                try {
                    field.setAccessible(true); // if field is private
                    field.set(basicClassExample, "test2"); // change field value
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(basicClassExample.getName());

        Method[] declaredMethods = basicClassExample.getClass().getDeclaredMethods();
        System.out.println("after invoke getAge method through reflection");
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("getAge")){
                try {
                    System.out.println(declaredMethod.invoke(basicClassExample));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("after invoke dummy method through reflection");
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("dummy")){
                try {
                    declaredMethod.setAccessible(true); // if method is private
                    declaredMethod.invoke(null); // if method is static
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


        System.out.println("after invoke agerAfterYears method through reflection");
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("ageAfterYears")){
                try {
                    declaredMethod.setAccessible(true); // if method is private
                    declaredMethod.invoke(basicClassExample, 7); // if method is not static
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


        System.out.println("example of get()");
        for (Field field: fields) {
            try {
                field.setAccessible(true);
                if (field.getName().equals("name")){
                    field.set(basicClassExample, null);
                }
                System.out.println(field.get(basicClassExample));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
