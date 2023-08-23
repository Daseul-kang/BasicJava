package chapter13;

public class BoxGeneric<T> {
    //타입의 안정성을 위해서 제네릭을 사용한다.
    //제네릭 타입은 대문자, 한글자로 쓰는것이 관례,
    // <T>=Type <E>: Array(elements) <K, V>:Map(Key, Value)

    private T value;

    public BoxGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
