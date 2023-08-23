package chapter04;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        System.out.print("프로그래밍 기초: ");
        int pro = scanner.nextInt();
        System.out.print("데이터베이스: ");
        int data = scanner.nextInt();
        System.out.print("화면구현: ");
        int screen = scanner.nextInt();
        System.out.print("애플리케이션 구현: ");
        int app = scanner.nextInt();
        System.out.print("머신러닝: ");
        int mac = scanner.nextInt();

        int total = pro + data + screen + app + mac;

        double avg = (double) total/ 5;
        String avgs = String.format("%.2f", avg);

        System.out.println("총점: " + total);
        System.out.println("평균: " + avgs);

        double score = avg;
        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        } else if (score >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }
    }
}
