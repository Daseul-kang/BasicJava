package chapter08;

public interface RemoteControl {
    //상수 필드만 가능, 변수 안됨!!!!!!!
    //public statinc final을 붙이지 않아도 자동으로 상수가 지정이 된다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;


    //추상 메소드 정의
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute){
            System.out.println("무음 처리합니다.");
            //추상메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
    static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
