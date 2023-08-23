package chapter14;

public class BeepPrintExample {
    public static void main(String[] args) throws Exception{
        //1. Thread 객체 사용

        //스레드 만들기
        //스레드를 익명 클래스로 만들기
        //스레드와 메인 클래스의 스레드는 별개인 것이다.
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("[먀먐먀ㅑ먀먀먀ㅑ]");
//                    try {
//                        Thread.sleep(1000);  //sleep 메소드: 메인 메소드가 잠깐 잠드는 것,,
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        };
//        thread.start();
//
//
//  2. Runnable Interface 구현
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("[먀먐먀ㅑ먀먀먀ㅑ]");
                    try {
                        Thread.sleep(1000);  //sleep 메소드: 메인 메소드가 잠깐 잠드는 것,,
                    } catch (Exception e) {
                    }
                }
            }
        };
        //Runnable 인터페이스를 구현해도 무조건 Thread 객체를 생성해서 메소드를 실행시켜야 한다.
        Thread thread = new Thread(runnable);
        thread.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("BEEP");
            Thread.sleep(1000); //sleep 메소드: 메인 메소드가 잠깐 잠드는 것,,,
        }
    }
    }


