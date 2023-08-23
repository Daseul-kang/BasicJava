package chapter08.example;
public abstract class Shape implements Comparable<Shape> {
    public Shape() {
    }

    public abstract double area();

    public abstract double perimeter();

    public int compareTo(Shape s) {
        if (area() > s.area()) {
            return 1;
        } else if (area() < s.area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
