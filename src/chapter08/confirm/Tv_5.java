package chapter08.confirm;

public class Tv_5 implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new Tv_5();
        r.powerOn();
    }
}
