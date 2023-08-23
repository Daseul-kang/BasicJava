package chapter11;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            //에러가 발생한 지점부터 로그를 보여준다.
            e.printStackTrace();
        } finally {
            System.out.println("이 코드는 무조건 실행됩니다.");
        }
    }
}
