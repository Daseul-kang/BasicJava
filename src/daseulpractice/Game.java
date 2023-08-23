package daseulpractice;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임");
        System.out.print("철수 : ");
        String su = scanner.nextLine();
        System.out.print("영희: ");
        String hee = scanner.nextLine();

        if (su.equals(hee)) {
            System.out.println("비겼습니다.");
        } else if((su.equals("가위") && hee.equals("보"))
        || (su.equals("바위") && hee.equals("가위"))
        || (su.equals("보") && hee.equals("바위"))) {
            System.out.println("철수가 이겼습니다.");
        } else {
            System.out.println("영화가 이겼습니다.");
        }
    }
}
