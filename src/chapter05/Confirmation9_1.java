package chapter05;

import java.util.Scanner;

public class Confirmation9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int[] scores = null;

        while (running) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택: ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.print("학생수> ");
                    int stuNum = Integer.parseInt(scanner.nextLine());
                    scores = new int[stuNum];
                }
                case 2 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]: ", i);
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                }
                case 3 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("socres[%d]: %d\n", i, scores[i]);
                    }
                }
                case 4 -> {
                    int max = 0;
                    int sum = 0;
                    double avg = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                }
                case 5 -> {
                    running = false;
                    System.out.println("프로그램 종료");
                }
            }
        }
    }
}
