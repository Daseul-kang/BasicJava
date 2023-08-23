package daseulpractice.chap08.staticfinalfield;

public class Television implements Remotecontrol{
    //필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }
    @Override
    public void setVolume(int volume) {
        //인터페이스에서 상수 필드를 이용해서 volume 필드의 값을 제한해보기
        if (volume > Remotecontrol.MAX_VOLUME) {
            this.volume = Remotecontrol.MAX_VOLUME;
        } else if (volume < Remotecontrol.MIN_VOLUME) {
            this.volume = Remotecontrol.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
