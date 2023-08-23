package chapter13;

public class Box {
    // value의 타입이 다 다른경우
    // 타입별 클래스를 다 만들어야 하는 불편함.
    // Object를 사용한 방

    Object value;
    // 타입을 Object로 정하면 모든 타입의 값을 받을 수 있다.


    public Box(Object value) { // Object obj = new String();
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
