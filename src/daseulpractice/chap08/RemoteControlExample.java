package daseulpractice.chap08;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 타입 변수 선언이 가능!
        RemoteControl rc;
        //RemoteControl rc = null;
        //인터페이스 타입 변수에는 객체를 참조하고 있지 않다는 뜻으로 null을 대입할 수 있다.

        //Television 객체를 생성하고, RemoteControl타입 rc에 대입!
        rc = new Television();

        //구현된 객체에 인터페이스 타입의 변수가 대입이 되었으면,
        //재정의 된 메소드를 호출할 수 있다
        rc.turnOn();

        //////////////////////////////////

        rc = new Audio();
        rc.turnOn();

    }
}
