package chapter08;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        //sort 정렬 알고리즘,,
        int[] numbers = {1, 6, 2, 8, 100, 22, 3, 1, 87};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        String[] names = {"홍길동", "이순신", "신용권", "임경균"};
        Student[] students = {
                new Student("강다슬", 11, 19),
                new Student("이다슬", 23, 32),
                new Student("김다슬", 44, 22),
                new Student("하다슬", 15, 15),
                new Student("박다슬", 26, 34),
                new Student("신다슬", 7, 66),
                new Student("오다슬", 23, 22),
                new Student("정다슬", 15, 23),
        };
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        //sort -> compareTo 인터페이스를 구현한 객체가 있으면,, 정렬해준대,,,,,
        // 규격!! 저걸 갖고있어야 됨. 뭔말인지 모르겠지만, 그냥 그런거라고 한다. 그냥 외워라....
        System.out.println("변경 후");
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(students));
    }
}
