package chapter03;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
        double radius = scanner.nextDouble();
        System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
        double height = scanner.nextDouble();

        //처리
        double area = radius * radius * Math.PI;
        double volume = area * height;

        //출력
        System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고, 부피는 " + volume + "㎤이다.");

    }
}
