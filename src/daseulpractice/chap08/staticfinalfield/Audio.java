package daseulpractice.chap08.staticfinalfield;

public class Audio implements Remotecontrol{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > Remotecontrol.MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < Remotecontrol.MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨: " + volume);
    }

    private int memoryVolume;

    //인터페이스의 디폴트 메소드 재정의
    //재정의 시 무조건!! public 앞에 붙여야 됨, default 생략
    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다.");
            setVolume(Remotecontrol.MIN_VOLUME);
        } else {
            System.out.println("무음해제합니다.");
            setVolume(this.memoryVolume);
        }

    }
}
