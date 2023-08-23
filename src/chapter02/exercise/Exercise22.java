package chapter02.exercise;

public class Exercise22 {
    public static void main(String[] args) {
        double distance = 40e12;
        double speed = 300000;
        double time = distance/speed;
        double minute = time/60;
        double hour = minute/60;
        double day = hour/24;
        double year = day/365;
        System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + year + "광년이다.");
    }
}
