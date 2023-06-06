package practice.annotationExample;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface CommaSeparatedList {
}

class MyClass {
    @CommaSeparatedList
    private String commaSeparatedValues;

    public String getCommaSeparatedValues() {
        return commaSeparatedValues;
    }

    public void setCommaSeparatedValues(String commaSeparatedValues) {
        this.commaSeparatedValues = commaSeparatedValues;
    }
}

class MyClassProcessor {
    public static void process(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(CommaSeparatedList.class)) {
                field.setAccessible(true);

                String fieldValue = (String) field.get(obj);

                if (fieldValue != null) {
                    List<String> list = Arrays.stream(fieldValue.split(","))
                            .map(String::trim)
                            .collect(Collectors.toList());

                    field.set(obj, list);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        MyClass myClass = new MyClass();
        myClass.setCommaSeparatedValues("apple, banana, orange");

        System.out.println("Before processing: " + myClass.getCommaSeparatedValues());

        MyClassProcessor.process(myClass);

        System.out.println("After processing: " + myClass.getCommaSeparatedValues());
    }
}

