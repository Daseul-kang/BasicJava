package chapter06.confirmation;

public class Printer2 {
    static int value1;
    static boolean value2;
    static double value3;
    static String value4;
// 17번 문제
    static {
        value1 = 10;
        value2 = true;
        value3 = 5.7;
        value4 = "홍길동";
    }

    static void println2() {
        value1 = 10;
        value2 = true;
        value3 = 5.7;
        value4 = "홍길동";

        System.out.println("int value1: " + value1);
        System.out.println("int value2: " + value2);
        System.out.println("int value3: " + value3);
        System.out.println("int value4: " + value4);
    }
}
//다시해보
