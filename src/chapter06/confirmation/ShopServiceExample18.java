package chapter06.confirmation;

import chapter06.Singleton;

public class ShopServiceExample18 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
