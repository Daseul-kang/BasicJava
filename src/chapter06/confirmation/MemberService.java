package chapter06.confirmation;
//15번
public class MemberService {
    String id;
    String password;
    MemberService() {
    }
    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } return false;
    }
    public void logout(String id) {
        System.out.println(id +"님이 로그아웃 되었습니다.");
    }
}
//메소드가 먼저 주어질 경우 메소드 먼저 써 놓고 시작하기

    

        


    
