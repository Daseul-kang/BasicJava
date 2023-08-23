package chapter04;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B입니다.");
        // 중괄호를 쓰지 않으면 if문 바로 아래에 있는 명령만 if 조건에 영향을 받아 실행된다!
        // 그래서 13라인만 영향을 받아서 14라인은 자동으로 출력이 된다.
        }
    }

