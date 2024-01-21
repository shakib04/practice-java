package practice.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    @Test
    void intToChar() {
        char c = StringUtility.getCharFromASCII(65);
        assertEquals('A', c);
    }

    @Test
    void convertToASCII() {
        int asciiValue = StringUtility.convertToASCII('A');
        assertEquals(65, asciiValue);
    }
}