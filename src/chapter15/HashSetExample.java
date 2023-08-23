package chapter15;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("강다슬", 28));
        set.add(new Member("강다슬", 28));

        // Member 클래스에 HashCode와 equals 가 재정의되어있기 때문에
        // 중복 객체는 저장되지 않는다.
        System.out.println("총 객체 수: " + set.size());
    }
}
