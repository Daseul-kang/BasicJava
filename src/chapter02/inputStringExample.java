package chapter02;

import java.util.Scanner;

public class inputStringExample {
    public static void main(String[] args) {
        /*
        콘솔에 결과 출력하는 내용
        이름: 강다슬
        나이: 28
        전화: 010-1111-1111
         */
        //입력 부분
        Scanner scanner = new Scanner(System.in);
        //스캐너 준비작업
        System.out.print("이름을 입력하세요: ");
        //콘솔창에 출력을 함
        String name = scanner.next();
        //next 를 쓰면 문자열을 입력받을 수 있는 대기상태가 됨
        System.out.print("나이를 입력하세요: ");
        String age = scanner.next();
        System.out.print("휴대폰 번호를 입력하세요: ");
        String number = scanner.next();
        //출력 부분
        System.out.println("이름: " + name);
        System.out.print("나이: " + age + "\n");
        System.out.printf("전화번호: %s", number);
    }
}
