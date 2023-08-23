package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadExample {
    public static void main(String[] args) throws IOException {

        // 1. Reader 로 출력하는방법
        // 문자열 출력은 InputStream 보다는 Reader 출력방법을 선호한다.
        FileInputStream inputStream = new FileInputStream("test.db");
        FileReader reader = new FileReader("test.db");
        char[] buffer = new char[200];
        String result1 = new String();
        int data1 = 0;
        while ((data1 = reader.read(buffer)) != -1){
            result1 += new String(buffer, 0, data1);
        }
        System.out.println(result1);
        System.out.println();

        // 2. InputStream 으로 출력하는 방법.
        String result = "";
        byte[] bytes = new byte[90];  // 1024byte = 1kb

        // 1 byte 씩 읽음 반복문사용 해줘야함.
        // 읽은 데이터를 Buffer bytes 에 저장
        int data = 0;
        while ((inputStream.read(bytes)) != -1) {
            result += new String(bytes, 0, data);
        }
        System.out.println(result);
    }
}