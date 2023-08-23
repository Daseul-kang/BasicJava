package chapter02;

public class StringExample {
    public static void main(String[] args) {
        int a = 100;
        String b = "b";
        String name = "홍길동";
        String job = "프로그래머";
        String str = "나는 \"자바\"를 배웁니다^_^";
        // 큰 따옴표 안에 큰따옴표로 강조를 하고 싶을 때 역슬래시를 이용(\)하여 문자 안에 문자로 포함을 시킨다.

        /*
        역슬래시(\) 사용
        \"
        \'
        \t: tab(공백을 의미)
        \n: new line(line feed) 줄바꿈
        \r: carriage return
        \\
        */

        System.out.println(str);
        String multiStr = """
                여러 라인을
                문자로 표현
                가능합니다.
                자바 13부터 가능합니다.
                """;
    }
}
