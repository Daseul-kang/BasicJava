package chapter18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) throws IOException {

        // 파일을 쓰기 위한 준비작업
        FileOutputStream outputStream = new FileOutputStream("test.db");
        outputStream.write("안녕하세요.\n고급자바를 수업중입니다.\n이제 곧 가을이 다가옵니다.".getBytes());
        // flush(): 실제 파일에 데이터 저장
        outputStream.flush();
        // 자원 사용후 종료
        outputStream.close();

        // 저장은 같은 프로젝트 기준으로 생성이 된다.
        // 출력(읽기)는 저장된 파일에서 열기 또는 읽기파일을 따로만들어서 확인해야함.
    }
}
