package chapter02.exercise;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("가로의 길이를 입력하세요: ");
        double width= scanner.nextDouble();
        System.out.print("세로의 길이를 입력하세요: ");
        double height= scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("직사각형의 넓이: " + area);
        System.out.println("직사각형의 둘레: " + perimeter);
    }
}

//입력

//처리

//출력


