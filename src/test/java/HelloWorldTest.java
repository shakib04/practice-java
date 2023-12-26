import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import practice.HelloWorld;

public class HelloWorldTest {

    @Test
    public void testMain() throws JsonProcessingException {
        HelloWorld.main(new String[]{"abc"});
    }
}
