package chapter06;

public class Car2Example {
    public static void main(String[] args) {
        //Car객체 생성
        Car2 car2 = new Car2();

        //리턴값이 없는 setGas() 메소드 호출
        car2.setGas(5);

        //isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if(car2.isLeftGas()) {
            System.out.println("출발합니다.");

            //리턴값이 없는 run() 메소드 호출
            car2.run();
        }

        System.out.println("gas를 주입하세요.");
    }
}
