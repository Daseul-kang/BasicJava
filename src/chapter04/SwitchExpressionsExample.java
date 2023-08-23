package chapter04;
//Java 12 이후 부터 break 문을 없애고 화살표와 중괄호를 사용하여 가독성이 좋아짐
public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수회원입니다.");
            }
        case 'B', 'b' -> {
            System.out.println("일반 회원입니다.");
            }
        default -> {
            System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
