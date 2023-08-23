package chapter04;

import java.util.Random;

public class ConfirmationQuestion4 {
    public static void main(String[] args) {
        Random random = new Random();

        int ranNum1 = random.nextInt(6) + 1;
        int ranNum2 = random.nextInt(6) + 1;

        while (ranNum1 + ranNum2 != 5) {
            ranNum1 = random.nextInt(6) + 1;
            ranNum2 = random.nextInt(6) + 1;
            System.out.println("( " + ranNum1 + ", " + ranNum2 + " )");

            if (ranNum1 + ranNum2 != 5) {
                System.out.println("( " + ranNum1 + ", " + ranNum2 + " )");

            } else if (ranNum1 + ranNum2 == 5) {
                System.out.println("프로그램 종료");
            }

        }
    }
}