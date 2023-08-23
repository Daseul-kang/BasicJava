package chapter03;

public class ConfirmationQuestion4 {
    public static void main(String[] args) {
        int value = 365;
        System.out.println(value - value % 100);
        // 방법 1. 정수 / 정수 -> 정수가 된다.
        // 방법 2. 나머지를 이용한다.
        // 다른 방법 ! -> value / 100 * 100
    }
}
