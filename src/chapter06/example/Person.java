package chapter06.example;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setName(String name){
        this.name = name;
    }
    //set은 리턴타입은 없고, set을 할 때 매개변수를 넣어줘야 함.

    public int getAge() {
        return age;
    }
    //값을 가지고 오는 것이기 때문에 매개변수가 없음.

    public String getName() {
        return name;
    }
}
