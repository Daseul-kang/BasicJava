package chapter02;

import java.util.Scanner;

public class PhoneNumberExample {
    public static void main(String[] args) {
        /*
        전화번호를 세 부분으로 나누어 입력받고
        010-1234-1234로 출력하는 코드를 작성하시오
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("전화번호 앞 세자리를 입력하세요: ");
        String p1= scanner.next();
        System.out.print("전화번호 가운데 네자리를 입력하세요: ");
        String p2= scanner.next();
        System.out.print("전화번호 마지막 네자리를 입력하세요: ");
        String p3 = scanner.next();
        //내 답안
        System.out.println("\n귀하의 전화번호는 " + p1 + "-" + p2 + "-" + p3 + "입니다.");
        //선생님 답안
        System.out.printf("전화번호: %s-%s-%s", p1, p2, p3);

    }
}
