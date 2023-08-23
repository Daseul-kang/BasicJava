package chapter18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws Exception {
        // URI(uniform resource identifier): 같은 페이지이지만 개인별로 보여주는 내용이 다름(고유한 데이터), ex.메일
        // URL(uniform resource location): 같은 문서(페이지)

        //파일 클래스로 폴더 객체를 생성하는 방법.
        File dir = new File("/home/pc15/mydirectory");

        if (!dir.exists()) {
            dir.mkdir();
        }
        // 파일생성
        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");
        File file3 = new File(dir, "file3.txt");

        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }

        System.out.println(dir.exists()); //파일이 존재하는지 확인

        // 파일을 간단하게 쓸 수 있다.
        Files.writeString(Paths.get("mydata.txt"),
                "안녕하세요. 이제 곧 점심시간이 다가옵니다."
                        + "오늘은 무엇을 먹을까요?");

    }
}
