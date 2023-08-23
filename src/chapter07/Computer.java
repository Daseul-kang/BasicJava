package chapter07;

public class Computer extends Calculator {
    //Annotation: 해시태그와 비슷한 느낌
    @Override
    public double areaCircle(double r) {
        return Math.PI * r * r;
        //부모 호출 super.areaCircle(r);
    }
}
