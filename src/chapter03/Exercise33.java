package chapter03;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("윤년인지를 확인할 연도를 입력하세요.: ");
        int a = scanner.nextInt();

        String result = ((( (a % 4 == 0) && (a % 100 != 0) ) || ( a % 400 == 0)) ? "윤년입니다." : "윤년이 아닙니다.");
        System.out.println( a + "년은 " + result);

        //다른 방법: 변수를 지정해서 깔끔하게 쓸 수 있다.
        /*
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;
        String result = ((b == 0) && (c != 0)) || (d == 0) ? "윤년입니다." : "윤년이 아닙니다.);
         */
    }
}
