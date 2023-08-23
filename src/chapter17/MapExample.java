package chapter17;

import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {

        // 1부터 9까지의 숫자를 구구단 2단을 map 을 사용해서 만들어보기
        // operand 를 이용하여 1부터 9까지 개속 대입하여줌
        // EX) Map 으로 IntStream 타입으로 바꿔주고 mapToObj 로 객체 타입의 Stream 으로 바꿔줌
        IntStream.range(1, 10).mapToObj(operand -> {
            return  3 + " * " + operand + " = "+  (operand * 3);
        }).forEach(System.out::println);

        }
    }