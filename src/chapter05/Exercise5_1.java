package chapter05;

public class Exercise5_1 {
    public static void main(String[] args) {
        //다음 배열에서 최댓값과 최솟값을 구하시오\
        int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
        int max = 0;
        int min = 100;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("최댓값은: " + max);

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("최솟값은: " + min);
    }
}
