package chapter04;

import java.util.Objects;
import java.util.Scanner;

public class Exercise44_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임");
        System.out.print("철수: ");
        String su = scanner.next();
        System.out.print("영희: ");
        String hee = scanner.next();

        if (su.equals(hee)) {
            System.out.println("비겼습니다.");
        } else if ((su.equals("가위") && hee.equals("보"))
                || (su.equals("바위") && hee.equals("가위"))
                || (su.equals("보") && hee.equals("바위"))) {
            System.out.println("철수가 이겼습니다!!!");
        } else {
            System.out.println("영희가 이겼습니다!!!");
        }
    }
}

