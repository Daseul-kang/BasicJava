package daseulpractice.chap08;

//인터페이스를 구현하는 클래스에서는 인터페이스에 정의된 추상 메소드를 재정의해야한다.
public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }
}
