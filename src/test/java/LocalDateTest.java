import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

enum TestEnum{
    regular_confirmed, regular_probation
}

public class LocalDateTest {

    @Test
    void localDateDaysBefore(){
        LocalDate startDate = LocalDate.of(2022, 10, 8);
        LocalDate endDate = startDate.minusDays(7);

        LocalDate expectedDate = LocalDate.of(2022, 10, 1);
        LocalDate expectedDate02 = LocalDate.of(2022, 10, 2);
        Assertions.assertEquals(endDate, expectedDate);
        //Assertions.assertEquals(true, expectedDate02.isBefore());
    }

    @Test
    void appliedDateIsBefore07Days(){
        LocalDate appliedDate = LocalDate.now();
        LocalDate beforeDate01 = LocalDate.now().plusDays(4);

        Assertions.assertEquals(true, appliedDate.isAfter(beforeDate01));
    }

    @Test
    void testEnumEqual(){
        Assertions.assertEquals(true ,TestEnum.regular_confirmed == TestEnum.regular_confirmed);
    }

    @Test
    void testLocalDateIsBeforeForLoop(){
        LocalDate startDate = LocalDate.of(2022, 2, 10);
        LocalDate endDate = LocalDate.of(2022, 2, 12);

        int count  = 0;
        LocalDate date;
        for (date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)){
            count++;
        }
        Assertions.assertEquals(date, endDate);
        Assertions.assertEquals(3, count);
    }
}
