package chapter07;

public class LiskovExample {
    public static void main(String[] args) {
        Parent child = new Child();
        Child c = (Child) child;
        c.method3();
        child.method2();
        System.out.println(child.balance); //Parent child로 선언이 되어있어서 Parent주소로 갑니다.. 그래서 100이 뜸
        //부모와 자식은 필드를 공유하지 않음!
    }
}
