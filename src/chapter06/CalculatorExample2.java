package chapter06;

public class CalculatorExample2 {
    public static void main(String[] args) {
        //객체생성
        Calculator2 calculator2 = new Calculator2();

        //정사각형의 넓이 구하기
        double result1 = calculator2.areRectangle(10);

        //직사각형의 넓이 구하기
        double result2 = calculator2.areRectangle(10, 20);

        System.out.println("정사각형의 넓이=" + result1);
        System.out.println("직사각형의 넓이=" + result2);
        }
    }

