package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data02 {
    public static void main(String[] args){

        LocalDate data4 = LocalDate.parse("2025-03-31");
        LocalDateTime data5 = LocalDateTime.parse("2025-03-31T18:32:48");
        Instant data6 = Instant.parse("2025-03-31T18:32:48Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Data4 "+ data4.format(fmt1));
        System.out.println("Data4 "+ fmt1.format(data4));
        System.out.println("Data4 "+ data5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Data5 "+ data5.format(fmt1));
        System.out.println("Data5 "+ data5.format(fmt2));
    }
}
