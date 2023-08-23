package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Confirmation9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] scores = null;
        int stuNum = 0;
        int i = 0;


        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택: ");
            String menu = scanner.nextLine();

            if(menu.equals("1")) {
                System.out.print("학생수> ");
                stuNum += Integer.parseInt(scanner.nextLine());
                scores = new int[stuNum];
            } else if (menu.equals("2")) {
                for (i=0; i < scores.length; i++);
                System.out.print("scores[" + i + "]");
                scores[i] = Integer.parseInt(scanner.nextLine());
            } else if (menu.equals("3")) {
                for (i=0; i < scores.length; i++);
                System.out.println("scores[" + i + "]");
            } else if (menu.equals("4")) {
               int scoreSum = 0;
               int max = 0;
               for (i = 0; i<scores.length; i++) {
                   if (max<scores[i]) {
                       max = scores[i];
                   } else {
                       max = max;
                   }
               } scoreSum =+ scores[i];
               double avg = (double) scoreSum /stuNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (menu.equals("5")) {
                run = false;
                System.out.println("프로그램 종료");
            }
        }
    }
}
