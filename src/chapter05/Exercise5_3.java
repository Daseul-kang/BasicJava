package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위 바위 보를 입력하세요: ");

        while (true) {
            Random random = new Random();
            int i = random.nextInt(3);

            String[] com = {"가위", "바위", "보"};
            String user = scanner.next();
            System.out.println("게이머: " + user);
            String computer = com[i];
            System.out.println("인공지능 컴퓨터: " + computer);

            if (user.equals(computer)) {
                System.out.println("비겼습니다.");
            } else if ((user.equals("가위") && com[i].equals("보")) || (user.equals("바위") && com[i].equals("가위")) || (user.equals("보") && com[i].equals("주"))) {
                System.out.println("결과: 게이머 승리!!!!");
            } else {
                System.out.println("결과: 인공지능 승리!!!!");
            }
        }
    }
}

