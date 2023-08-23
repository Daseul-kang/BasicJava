package chapter05;

import java.util.Random;
//선새님 너무 어려워요 못하겠어요..................
public class Exercise5_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dice = new int[6];

        System.out.println("-------------------");
        System.out.println("면              빈도");
        System.out.println("-------------------");

        for (int i = 0; i < 10000; i++) {
            int j = random.nextInt(6) + 1;

            switch (j) {
                case 1:
                    dice[0]++;
                    break;
                case 2:
                    dice[1]++;
                    break;
                case 3:
                    dice[2]++;
                    break;
                case 4:
                    dice[3]++;
                    break;
                case 5:
                    dice[4]++;
                    break;
                case 6:
                    dice[5]++;
                    break;
            }
        }
        System.out.println("1  " + dice[0]);
        System.out.println("2  " + dice[1]);
        System.out.println("3  " + dice[2]);
        System.out.println("4  " + dice[3]);
        System.out.println("5  " + dice[4]);
        System.out.println("6  " + dice[5]);
    }
}
