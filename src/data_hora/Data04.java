package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data04 {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-04-01");
        LocalDateTime d02 = LocalDateTime.parse("2025-04-01T20:02:42");
        Instant d03 = Instant.parse("2025-04-01T20:02:42Z");

        LocalDate pastWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);

        System.out.println("pastWeek = "+pastWeek);
        System.out.println("nextWeek = "+nextWeek);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant= d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = "+pastWeekInstant);
        System.out.println("nextWeekInstant = "+nextWeekInstant);

        Duration t1 = Duration.between(pastWeek, d02);

        System.out.println("t1 dias "+t1.toDays());
    }
}
