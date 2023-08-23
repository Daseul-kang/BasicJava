package chapter12.confirmation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Confirm15 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy,MM,dd a HH:mm:ss");

        System.out.println("현재 날짜: " + now.format(dtf));

        LocalDateTime end = LocalDateTime.of(2023, 12, 31, 0, 0, 0);
        System.out.println("종료일: " + end.format(dtf));

        long remainDay = now.until(end, ChronoUnit.DAYS);
        System.out.println("남은 날짜: " + remainDay);

        //간단한 방법
        long diff = LocalDateTime.now().until(LocalDateTime.of(2023, 12, 31, 0, 0, 0), ChronoUnit.DAYS);
        System.out.println("남은 날짜: " + diff);
    }
}
