package chapter06.confirmation;

public class ShopService18 {
    private static ShopService18 singleton = new ShopService18();
    private ShopService18() {
    }
    public static ShopService18 getInstance() {
        return singleton;
    }
}
