package chapter12;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data2= "홍길동&이수홍,박연수,김자바-최명호";
        String data1= "홍길동$이수홍$박연수$김자바$최명호";

        //split메소드 => 분리된 데이터를 배열로 만듦.
        //데이터 구조가 달라지는 예외가 있을 경우 예외가 발생한다.
        //regex 정규표현식? regular expression ,,,?
        //정규표현식에 역 슬래시 두 개 쓰기..! 원래 \뒤에는 n,r,t,",'만 올 수 있는데 다른 문자가 오면 에러?나니까 두개 붙임..?
        String[] data1Split = data1.split("\\$");
        System.out.println(Arrays.toString(data1Split));
        //String myData = data1Split[4];
        //같은 기호가 아니어도 & , - 처럼 입력한 기호로 로 구분을 할 수 있다.
        String[] data2Split = data2.split("[&,-]");
        System.out.println(Arrays.toString(data2Split));

        //StringTokenizer
        //반복문을 가지고 빼내는 작업을 해야된다.
        //데이터가 있는 경우에만 사용해서 조금 더 안전. 근데 귀찮아서,, 잘 안쓰신다고 한다....!?!
        StringTokenizer tokenizer = new StringTokenizer(data1, "$");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);

        }

    }

}
