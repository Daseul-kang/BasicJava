package chapter04;

import java.util.Scanner;

public class ConfirmationQuestion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int total = 0;

        while(run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.print("선택: ");
            String strNum = scanner.nextLine();

            if(strNum.equals("1")){
                System.out.print("예금액> ");
                total += Integer.parseInt(scanner.nextLine());
            } else if (strNum.equals("2")) {
                System.out.print("출금액> ");
                total -= Integer.parseInt(scanner.nextLine());
            } else if (strNum.equals("3")) {
                System.out.println("잔고>" + total);
            } else if (strNum.equals("4")) {
                System.out.println();
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}
