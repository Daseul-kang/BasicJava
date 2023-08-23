package chapter04;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 3, 4, 5 -> System.out.println(month + "월은 봄입니다.");
            case 6, 7, 8 -> System.out.println(month + "월은 여름입니다.");
            case 9, 10, 11 -> System.out.println(month + "월은 가을입니다.");
            case 12, 1, 2 -> System.out.println(month + "월은 겨울입니다.");
            default -> System.out.println(month + "월은 잘못된 입력입니다.");
        }
    }
}
