package practice.formatting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageFormatExampleTest {

    @Test
    void main() {
        String test = MessageFormatExample.test();
        assertEquals(test, "Hello, 'John Doe'!");
    }
}
