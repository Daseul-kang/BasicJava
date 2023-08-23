package chapter12.confirmation;

public class Confirm08 {
    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] scores = new int[1000];
        for(int i = 0; i<scores.length; i++) {
            scores[i] = i;
        }
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;


        System.out.println(avg);
        long end = System.nanoTime();
        System.out.println("계산에 " + (end-start) + " 나노초가 소요되었습니다.");
    }
}
