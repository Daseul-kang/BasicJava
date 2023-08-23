package chapter06.Exercise;
//1번 자바 빈즈 패턴
public class Circle {
    private double radius; //반지름
    private double x; //x좌표
    private double y; //y좌표
    double area;
    public Circle() {
    }
    public void setRadius(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        this.area = radius * radius * Math.PI;
        return area;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
}
