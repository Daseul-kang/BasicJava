package chapter12.confirmation;

import java.util.StringTokenizer;

public class Confirm11 {
    public static void main(String[] args) {
        String data1 = "아이디,이름,패스워드";

        //두 가지 방식!
        //1. split
        String[] split = data1.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        //2. Tokenizer
        StringTokenizer st = new StringTokenizer(data1, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);

        }
    }
}
