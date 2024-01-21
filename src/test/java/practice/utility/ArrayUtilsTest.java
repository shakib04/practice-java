package practice.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest extends BaseTest {

    @Test
    void convertStringToIntArray() {
        int[] actual = ArrayUtils.convertStringToIntArray("ABCD");
        int[] expected = new int[]{65, 66, 67, 68};
        assertArrayEquals(expected, actual);
    }
}