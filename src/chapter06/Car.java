package chapter06;

public class Car {
    //필드 선언

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
        this(null, null, 0);
    }

    public Car(String model) {
        this(model, null, 0);
    }

    public Car(String model, String color) {
        this(model, color, 0);
    }
    /*
    중복코드 제거

    public Car(String model, String color) {
        this(model);
        this.color = color;
    }
     */

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("car 클래스가 생성되었습니다.");
    }

      /*
    중복코드 제거

    public Car(String model, String color, int maxSpeed) {
        this.(model, color);
        this.maxSpeed = maxSpeed;
    }
     */
}
