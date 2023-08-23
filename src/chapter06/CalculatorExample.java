package chapter06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();
        int result1 = calculator.plus(10, 20);
        System.out.println("합계: " + result1);

        int x = 10;
        int y = 4;
        //divide() 메소드 호출 시 변수 x 와 y의 값을 매개값으로 제공하고,
        //나눗셈 결과를 리턴 받아 result2변수에 대입
        double result2 = calculator.divide(x, y);
        System.out.println("result2: " + result2);

        //리턴값이 없는 powerOff() 메소드 호출
        calculator.powerOff();

        //233쪽 해보세요~
    }
}
