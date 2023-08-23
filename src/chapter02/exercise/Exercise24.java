package chapter02.exercise;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("500원짜리 동전의 갯수: ");
        int a1 = scanner.nextInt();
        System.out.print("100원짜리 동전의 갯수: ");
        int a2 = scanner.nextInt();
        System.out.print("50원짜리 동전의 갯수: ");
        int a3 = scanner.nextInt();
        System.out.print("10원짜리 동전의 갯수: ");
        int a4 = scanner.nextInt();
        int total = 500 * a1 + 100 * a2 + 50 * a3 + 10 * a4;
        System.out.println("저금통 안의 동전의 총 액수: " + total);
    }
}
