package chapter02;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 20;
        int result = v1 + v2;

        byte v3 = 10;
        byte v4 = 20;
        byte result2 = (byte) (v3 + v4);

        int v5 = 1;
        int v6 = 2;
        double result3 = (double) v5 / v6;
        /*
        double result3 = v5/v6 을 하면 몫만 결과값으로 나온다.
        소수점까지 표시하기 위해서는 double로 강제 캐스팅으로 해야됨
        */
        System.out.println(result3);
    }
}
