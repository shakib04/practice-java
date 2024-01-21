package practice.utility;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class BaseTest {

    @Test
    void testHashmapGet(){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        assertEquals(null, objectObjectHashMap.get("k"));
    }
}
