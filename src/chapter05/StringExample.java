package chapter05;

public class StringExample {
    public static void main(String[] args) {
        String a = "홍";
        String b = "홍";
        System.out.println(a == b);
        // 리터럴 타입 변수 생성. Heap안의 Spring pool에 저장되어 동일 문자는 같은 주소를 참조한다.

        String c = new String("홍");
        String d = new String("홍");
        // 객체 생성 방식 변수 생성. 개별적으로 주소가 생성됨.
        System.out.println(c == d);
        System.out.println(a == c);


    }
}
