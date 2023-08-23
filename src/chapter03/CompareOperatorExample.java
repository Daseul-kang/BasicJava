package chapter03;

public class CompareOperatorExample {
    public static void main(String[] args) {
        System.out.println("홍길동" != "홍길동"); //문자는 동등 연산자를 사용하여 비교하면 안 됨.
        System.out.println("홍길동".equals("홍길동")); //문자열이 같은지 검사
        System.out.println(!"홍길동".equals("홍길동")); //문자열이 다른지 검사
    }
}
