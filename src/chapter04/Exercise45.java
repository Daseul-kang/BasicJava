package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i1 = random.nextInt(100) + 1;
        int i = 0;

        while (i != i1) {
            System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
            i = scanner.nextInt();
            if (i < i1) {
                System.out.println("정답은 더 큰 수 입니다.");
            } else if (i > i1) {
                System.out.println("정답은 더 작은 수 입니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("게임을 종료합니다.");
            }
        }
    }
}
