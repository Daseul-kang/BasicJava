package chapter05;

import java.util.Arrays;
import java.util.Collection;

public class Confirmation7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        // 최대값을 저장하는 변
        int max = 0;

        for (int i = 0; i<array.length; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }
        System.out.println("최댓값은: " + max);
    }
}
// ?????????????????????????????/