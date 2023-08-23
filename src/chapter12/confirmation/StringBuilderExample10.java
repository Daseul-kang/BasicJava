package chapter12.confirmation;

public class StringBuilderExample10 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            str.append(i);
        }
        str.toString();
        System.out.println(str);
    }
}
