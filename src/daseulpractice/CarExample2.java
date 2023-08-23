package daseulpractice;

public class CarExample2 {
    public static void main(String[] args) {
        //Car 객체 생성
        Car2 car2 = new Car2();

        //Car 객체의 필드 값 읽기
        System.out.println("제작회사: " + car2.company);
        System.out.println("모델: " + car2.model);
        System.out.println("색: " + car2.color);
        System.out.println("최고속도: " + car2.maxSpeed);
        System.out.println("현재속도: " + car2.speed);

        //Car 객체의 필드값 변경
        car2.speed = 100;
        System.out.println("수정된 속도: " + car2.speed);

    }
}
