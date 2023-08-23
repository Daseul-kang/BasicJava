package daseulpractice;

public class KoreanExample {
    public static void main(String[] args) {
        //korean 객체 생성
        Korean p1 = new Korean("다슬", "111111-1111111");
        //korean 객체 데이터 읽기
        System.out.println("p1.nation: " + p1.nation);
        System.out.println("p1.name: " + p1.name);
        System.out.println("p1.ssn: " + p1.ssn);
        System.out.println();

        //또 다른 Korean 객체 생성
        Korean p2 = new Korean("다스리", "111121-1111111");
        //또 다른 Korean 객체 데이터 읽기
        System.out.println("p2.nation : " + p2.nation);
        System.out.println("p2.name : " + p2.name);
        System.out.println("p2.ssn : " + p2.ssn);
    }
}
