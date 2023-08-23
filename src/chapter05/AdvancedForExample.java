package chapter05;

import java.util.Arrays;

public class AdvancedForExample {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 생성
        int[] scores = {95, 71, 84, 93, 87};
        //배열 항목 전체 합 구하기
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }
        // 최근 트렌드
        // fori 나 foreach 쓰지 않는 방식 : 함수형 프로그래밍 방식
        // Stream API(JDK 1.8에 추가된 방식)
        sum = Arrays.stream(scores).sum();
        System.out.println("점수 총합 = " + sum);

        //배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
        double avg1 = Arrays.stream(scores).average().getAsDouble();
        System.out.println("점수 평균 = " + avg1);
    }
}
