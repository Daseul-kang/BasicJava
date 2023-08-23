package daseulpractice.chap08.staticfinalfield;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 타입 변수 선언
        Remotecontrol rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        System.out.println("------------------------");

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        //인터페이스 정적 메소드 호출
        Remotecontrol.changeBattery();
    }
}
