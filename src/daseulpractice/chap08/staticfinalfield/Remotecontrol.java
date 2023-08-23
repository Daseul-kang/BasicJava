package daseulpractice.chap08.staticfinalfield;

public interface Remotecontrol {
    //인터페이스에 선언된 필드는 모두 public static final특성을 갖음
    //그래서 public static final을 생략하더라도 컴파일 과정에서 알아서 붙음
    //상수명: 대문자, 언더바로 연결!
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //인터페이스의 메소드는 선언부만 작성한다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //인터페이스에는 완전한 실행코드를 가진 디폴트 메소드를 선언할 수 있다.
    //리턴 타입 앞에 default 작성하기
    //디폴트 메소드는 상수 필드를 읽거나, 추상 메소드를 호출하는 코드 작성 가능
    //디폴트 메소드는 구현객체가 필요함.
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //정적(static)메소드 선언
    //정적 메소드는 구현객체없이 인터페이스 명으로 호출 가능!
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환하세요.");
    }
}

