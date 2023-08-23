package chapter13;

public class BoxGenericExample {

    public static void main(String[] args) {
        //타입의 안정성을 위해서 제네릭을 사용한다.
        BoxGeneric<String> boxGeneric = new BoxGeneric("다슬");
        String value = boxGeneric.getValue();

        BoxGeneric<Integer> box1 = new BoxGeneric(100);
        Integer value1 = box1.getValue();
    }
}
