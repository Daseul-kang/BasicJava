package chapter12;

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student(1, "강다슬");
        Student student2 = new Student(1, "강다슬");
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student2.toString());

    }
}
