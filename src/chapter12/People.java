package chapter12;

//jdk 14버전 이상
//데이터를 기록하는 용도
//필드는 자동으로 프라이빗이 됨
//알아서 만들어줌~
//public record People(String ssn, int age) {
//
//
//}

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private String ssn;
    private int age;
}