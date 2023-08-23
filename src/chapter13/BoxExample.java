package chapter13;

public class BoxExample {
    public static void main(String[] args) {
        //Object를 사용하면 원하는 타입으로 강제 캐스팅을 해야됨
        Box box = new Box("다슬");
        String value = (String) box.getValue();

        Box box1 = new Box(100);
        Integer value1 = (Integer) box1.getValue();

    }
}
