package chapter12;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PrintDateExample {
    public static void main(String[] args) {
        //Data 실행한 시점의 시각정보
        Date date = new Date();
        System.out.println(date);
        //yyyyMMddhhmmssSSS.jpg
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
        String myDate = dateFormat.format(date);
        System.out.println(myDate);


        // 2. Calendar 싱글톤 형식
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONDAY);//0~11 까지 출력됨.. 1더해야 됨
        int date1 = calendar.get(Calendar.DAY_OF_MONTH);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d년 %d월 %d일 (%d) %d시 %d분 %d초\n", year, month + 1, date1, day, hour, minute, second);

        //3. LocalDateTime (jdk 8 이상)
        //2023-08-07
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // Method chaining 방식
        String myDate1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초"));
        System.out.println(myDate1);

        LocalDateTime lastDate = LocalDateTime.of(2023, 1, 1, 2, 3, 4);

    }
}
