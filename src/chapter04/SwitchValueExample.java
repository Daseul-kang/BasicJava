package chapter04;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법: break 사용
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 =100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        //Java 12부터 가능: break 없애고 화살표와 중괄호를 사용하는 방식
        int score2 = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                //Java 13부터 가능: case가 단일 값일 경우 화살표 오른쪽에 기술, 중괄호를 사용할 땐 yield로 키워드값 지정
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
    }
}
