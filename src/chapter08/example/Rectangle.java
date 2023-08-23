package chapter08.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public String toString() {
        return String.format("도형의 종류: 직사각형, 둘레: %.2f㎝, 넓이: %.2f㎠,", perimeter(), area());
    }
}
