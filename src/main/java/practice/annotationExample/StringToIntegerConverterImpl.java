package practice.annotationExample;

public class StringToIntegerConverterImpl {

    @StringToIntegerConverter
    public Integer convert(String value) {
        return Integer.parseInt(value);
    }
}

