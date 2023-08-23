package chapter12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("휴대전화번호를 입력하세요. >> ");
        String inputStr = scanner.nextLine();
        // 정규표현식
        String regExp = "010-[0-9]{3,4}-[0-9]{4}";
        // Patter 클래스 matches 메소드
        boolean matches = Pattern.matches(regExp, inputStr);
        boolean matches1 = inputStr.matches(regExp);
        //둘다 같은 얘기임.

        if (matches) {
            System.out.println("전화번호가 정상적으로 입력되었습니다.");
        } else {
            System.err.println("올바른 휴대 전화 번호를 입력해 주세요.");
        }
        scanner.close();

        System.out.println("<a href='https://www.nextit.or.kr/a' class = 'a'>내용1</a>");
        System.out.println("<a href='https://www.nextit.or.kr/b' class = 'b'>내용2</a>");
        System.out.println("<a href='https://www.nextit.or.kr/c' class = 'c'>내용3</a>");
        System.out.println("<a href='https://www.nextit.or.kr/d' class = 'd'>내용4</a>");
        System.out.println("<a href='https://www.nextit.or.kr/e' class = 'e'>내용5</a>");
        System.out.println("<a href='https://www.nextit.or.kr/f' class = 'f'>내용6</a>");
        System.out.println("<a href='https://www.nextit.or.kr/g' class = 'g'>내용7</a>");
        System.out.println("<a href='https://www.nextit.or.kr/h' class = 'h'>내용8</a>");
        System.out.println("<a href='https://www.nextit.or.kr/i' class = 'i'>내용9</a>");
        System.out.println("<a href='https://www.nextit.or.kr/j' class = 'j'>내용10</a>");
    }
}
