package chapter04;

import java.util.Random;

public class ConfirmationQuestion4_1 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            System.out.printf("(%d, %d)\n,", dice1, dice2);
            if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}
