package chapter12.confirmation;

public class DecodingExample {
    public static void main(String[] args) {
        String bye = "안녕";
        byte[] byeBytes = bye.getBytes();
//        System.out.println(byeBytes);

        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes);
        System.out.println(str);
    }
}
