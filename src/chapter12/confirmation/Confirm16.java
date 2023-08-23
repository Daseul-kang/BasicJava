package chapter12.confirmation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Confirm16 {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        String formatted = sdf.format(now);
        System.out.println(formatted);
        //System.out.println(sdf.format(now));
    }
}
