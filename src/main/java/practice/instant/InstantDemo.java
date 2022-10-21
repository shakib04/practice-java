package practice.instant;

import java.time.*;

public class InstantDemo {
    public static void main(String[] args) {

        final ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");
        Instant instant1 = Instant.now()
                .atZone(dhakaZone)
                .withHour(12)
                .withMinute(43)
                .withSecond(0)
                .withNano(0)
                .toInstant();

        ZonedDateTime zonedDateTime = instant1.atZone(dhakaZone);

        Instant instant2 = LocalDate.of(2016, 1,2)
                .atStartOfDay(dhakaZone)
                .withHour(zonedDateTime.getHour())
                .withMinute(zonedDateTime.getMinute())
                .withSecond(00)
                .withNano(00)
                .toInstant();

        System.out.println(instant2);
    }
}
