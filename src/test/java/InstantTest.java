import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class InstantTest {


    @Test
    void getInstantByDate(){
        LocalDate date = LocalDate.now();
        Instant instant = Instant.now()
                .atZone(ZoneId.systemDefault())
                .withDayOfYear(date.getDayOfYear())
                .withHour(10)
                .withMinute(0)
                .withSecond(0)
                .toInstant();
        Assertions.assertEquals(instant.atZone(ZoneId.systemDefault()).toLocalDate(), date);
    }
}
