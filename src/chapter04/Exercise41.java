package chapter04;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삼각형 첫 번째 변의 길이를 입력하세요.: ");
        int first = scanner.nextInt();
        System.out.print("삼각형 두 번째 변의 길이를 입력하세요.: ");
        int second = scanner.nextInt();
        System.out.print("삼각형 세 번째 변의 길이를 입력하세요.: ");
        int third = scanner.nextInt();

        if (first > (second + third)) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else if (second > (first + third)) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else if (third > (first + second)) {
            System.out.println("삼각형을 만들 수 없습니다.");
        } else {
            System.out.println("삼각형을 만들 수 있습니다.");
        }
    }
}
