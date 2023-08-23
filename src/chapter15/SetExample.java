package chapter15;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("JDBC");
        subjects.add("JSP");
        subjects.add("java");
        subjects.add("Spring");
        subjects.add("jsp");
        subjects.add("Spring");
        // String 영 대소문자 구분
        // HashSet 에는 중복 객체는 저장되지 않는다
        System.out.println("총 개수: " + subjects.size());

        // Set의 데이터 가져오기
        // 1. Iterator(반복자)를 통해 가져오기
        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            String subject = iterator.next();
            System.out.println(subject);
            // 출력되는 순서는 입력한 순서와 다르게 나온다.
        }

        System.out.println("foreach 문을 통해 출력");
        // 2. foreach문을 통해 가져오기
        for (String subject : subjects) {
            System.out.println(subject);
        }


    }
}
