package chapter13;

import chapter08.confirm.C;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");


        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
