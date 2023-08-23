package chapter17;


import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {


        // List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신용권");
        list.add("신민철");

//        List<String> tempList = new ArrayList<>();
//        for (String s : list) {
//            if (!tempList.contains(s)) {
//                tempList.add(s);
//            }
//        }
//        for (String s : tempList) {
//            System.out.println(s);
//            tempList.remove(s);
//        }



        // 중복 요소 제거
//        list.stream().distinct().forEach(System.out::println);

        // list 에서 신으로 시작하는 이름만 출력하시오.

        List<String> tempList2 = new ArrayList<>();
//        for (String ss : list) {
//            if (ss.startsWith("신") && !tempList2.contains(ss)){
//                tempList2.add(ss);
//            }
//        }
//        for (String ss : tempList2) {
//            System.out.println(ss);
//        }

//        list.stream().distinct().filter(ss ->  (ss.startsWith("신"))).forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println); // 정렬
    }
}
