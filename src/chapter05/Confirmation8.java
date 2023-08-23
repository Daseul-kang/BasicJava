package chapter05;

public class Confirmation8 {
    public static void main(String[] args) {
        // 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요.
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("배열의 전체 합: " + sum);
        System.out.println("배열의 전체 평균: " + avg);

    }
}
