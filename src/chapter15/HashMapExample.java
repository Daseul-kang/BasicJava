package chapter15;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("강다슬", 98);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 1. 엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        // 1-1. entry
        Set<Entry<String, Integer>> entrySet1 = map.entrySet();
        entrySet1.iterator();
        // 1-2. foreach
        for (Map.Entry<String, Integer> entry : entrySet1) {
            String v = entry.getKey() + entry.getKey();
        }

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry의 수: " + map.size());
        System.out.println();


        // 2. Key로 값 얻기

        // 2-1. iterator
        Set<String> keySet1 = map.keySet();
        keySet1.iterator();

        // 2-2. foreach
        for (String s : keySet1) {
            map.get(s);
        }
        // 3. value 이용
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println(i);
        }

        // 책 예제
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + "(홍길동의 점수): " + value);
        System.out.println();

        //Key Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyiterator = keySet.iterator();
        while (keyiterator.hasNext()) {
            String k = keyiterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();



    }
}

