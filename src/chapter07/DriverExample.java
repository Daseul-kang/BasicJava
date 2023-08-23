package chapter07;

import chapter06.package1.B;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vehicle = new Bus();
        driver.drive(vehicle); //무슨말이야..?...???/?????????????????????????????????????????????????????????????@@
        driver.drive(new Taxi());
        Vehicle v = new Bus();

        Bus bus = (Bus) v;
        bus.checkFee();
        ((Bus) v).checkFee(); // 11, 12 열의 내용을 13열 한 줄로 표현 가능....



        method(new Bus());
    }
    private static void method(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) { // 객체 타입 확인 연산자 instanceof ......
//            Bus bus = (Bus) vehicle;
            bus.checkFee();
        } else {
            System.out.println("캐스팅 할 수 없습니다.");
        }
    }
}
