package chapter04;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = scanner.nextInt();

        // int score = 75;

        if(score>=90) {
//            System.out.println("점수가 100~90입니다.");
            System.out.println("와우 대단합니다!!");
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) {
//            System.out.println("점수가 90~89입니다.");
            System.out.println("열심히 공부하셨군요!!");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
//            System.out.println("점수가 70~79 입니다.");
            System.out.println("조금 더 공부하세요!");
            System.out.println("등급은 C입니다.");
        } else {
//            System.out.println("점수가 70 미만입니다.");
            System.out.println("야자 필참 대상자입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
