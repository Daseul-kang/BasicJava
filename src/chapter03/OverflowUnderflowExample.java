package chapter03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("-----------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }

        System.out.println("------------------");
        byte var3 = 127;
        for(int i=0; i<3; i++) {
            var3++;
            System.out.println("var3: " + var3);
        }
    }
}
