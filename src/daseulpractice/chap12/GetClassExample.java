package daseulpractice.chap12;

public class GetClassExample {
    public static void main(String[] args) {

        Class clazz = Car.class;
        System.out.println("패키지: " + clazz.getPackage().getName());
        System.out.println("클래스 simple name: " + clazz.getSimpleName());
        System.out.println("클래스 full name: " + clazz.getName());
    }
}
