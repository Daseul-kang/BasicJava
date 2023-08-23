package chapter06;

public class Person {
    // 이름 나이를 저장하는 필드선언
    String name;
    int age;
    String nation;
    //초기값을 설정하지 않아도 필드는 자동으로 기본값으로 초기화된다.

    //////////////////////////////////////////////////////////
    //생성자(Constructor)
    //생성자는 무조건 new를 통해서만 호출할 수 있다. PersonExample 참고
    //생성자 만드는 단축키: 이클립스: 알트 쉬프트 s, 인텔리제이 알트 인서트

    //default 생성자
    public Person() {
    }

    public Person(String nation, String name) {
        this.nation = nation;
        this.name = name;
    }

    /*
    매개 변수가 모두 문자열일 경우 매개변수의 순서를 바꿔서 생성자를 오버로딩 할 수 없다.
    public Person(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }
    */

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //값이 필요한 객체를 만들떄
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
