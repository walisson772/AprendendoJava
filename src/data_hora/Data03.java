package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Data03 {
    public static void main(String[] args){

        LocalDate data4 = LocalDate.parse("2025-03-31");
        LocalDateTime data5 = LocalDateTime.parse("2025-03-31T18:32:48");
        Instant data6 = Instant.parse("2025-03-31T18:32:48Z");

        LocalDate result1 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
        LocalDate result2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));

        System.out.println(result1);
        System.out.println(result2);

    }
}
