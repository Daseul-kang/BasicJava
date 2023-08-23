package chapter04;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        // 랜덤을 만드는 방법
        Random random = new Random(8);
//        Random random = new Random(8); 괄호 안에 숫자를 넣으면(seed 번호) 다른 사람과 공통된 값이 나옴. 안 쓰면 무작위로 추출

        int ranNum1 = random.nextInt(6) + 1;
//      random.nextInt(추출 갯수) + 시작하는 숫자;
        int ranNum2 = random.nextInt(6) + 1;
        int ranNum3 = random.nextInt(6) + 1;
        int ranNum4 = random.nextInt(6) + 1;
        int ranNum5 = random.nextInt(6) + 1;
        int ranNum6 = random.nextInt(6) + 1;

        System.out.println(ranNum1);
        System.out.println(ranNum2);
        System.out.println(ranNum3);
        System.out.println(ranNum4);
        System.out.println(ranNum5);
        System.out.println(ranNum6);
    }
}
