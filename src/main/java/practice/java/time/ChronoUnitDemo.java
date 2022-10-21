package practice.java.time;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        Instant inTime = Instant.now()
                .atZone(ZoneOffset.systemDefault())
                .withHour(11)
                .withMinute(4)
                .withSecond(59)
                .toInstant();

        Instant outTime = Instant.now()
                .atZone(ZoneOffset.systemDefault())
                .withHour(19)
                .withMinute(8)
                .toInstant();
        System.out.println(ChronoUnit.MINUTES.between(inTime, outTime) % 60);
    }
}
