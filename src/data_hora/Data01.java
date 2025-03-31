package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data01 {
    public static void main(String[] args){

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2025-03-31");
        LocalDateTime data5 = LocalDateTime.parse("2025-03-31T18:32:48");
        Instant data6 = Instant.parse("2025-03-31T18:32:48Z");
        Instant data7 = Instant.parse("2025-03-31T18:32:48-03:00");

        LocalDate data8 = LocalDate.parse("31/03/2025", fmt);
        LocalDate data9 = LocalDate.parse("31/03/2025 18:42", fmt2);
        LocalDate data10 = LocalDate.of(2025, 3, 31);

        System.out.println("Data 1 "+data1);
        System.out.println("Data 2 "+data2);
        System.out.println("Data 3 "+data3);
        System.out.println("Data 4 "+data4);
        System.out.println("Data 5 "+data5);
        System.out.println("Data 6 "+data6);
        System.out.println("Data 7 "+data7);
        System.out.println("Data 8 "+data8);
        System.out.println("Data 9 "+data9);
        System.out.println("Data 10 "+data10);
    }
}
