package chapter12;

//StringBuilder클래스
//append 붙인다...
public class StringBuilderExample {
    public static void main(String[] args) {
        String userId = "a001";
        String paasword = "aaaa";
        StringBuilder builder = new StringBuilder();
        builder.append("select id, password, name, from member where id = '")
                .append(userId)
                .append("' and password = '")
                .append(paasword)
                .append("'");

        System.out.println(builder);


    }
}