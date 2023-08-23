package chapter04;

import java.util.Objects;
import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임");
        System.out.print("철수: ");
        String a = scanner.next();
        System.out.print("영희: ");
        String b = scanner.next();

        while (a.equals("가위")) {
            if (b.equals("가위")) {
                System.out.println("결과: 비겼습니다.");
            } else if (b.equals("바위")) {
                System.out.println("결과: 영희 승리!");
            } else if (b.equals("보")) {
                System.out.println("결과: 철수 승리!");
            }
            break;
        }
        while (a.equals("바위")) {
            if (b.equals("바위")) {
                System.out.println("결과: 비겼습니다.");
            } else if (b.equals("보")) {
                System.out.println("결과: 영희 승리!");
            } else if (b.equals("가위")) {
                System.out.println("결과: 철수 승리!");
            }
            break;
        }
        while (a.equals("보")) {
            if (b.equals("보")) {
                System.out.println("결과: 비겼습니다.");
            } else if (b.equals("가위")) {
                System.out.println("결과: 영희 승리!");
            } else if (b.equals("바위")) {
                System.out.println("결과: 철수 승리!");
            }
            break;
        }
    }
}
