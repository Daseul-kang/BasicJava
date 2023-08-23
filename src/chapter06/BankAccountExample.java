package chapter06;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        b1.deposit(10_000);
        System.out.println("b1의 잔액: " + b1.balance);
        b2.withdraw(5_000);
        System.out.println("b2의 잔액: " + b2.balance);
        System.out.println("b3의 잔액: " + b3.balance);
        //balance가 static으로 되어있기 때문에, 같은 공공재를 바라보고 있어서 객체를 따로 설정해도 값이 이상하게 나옴!!!
        //이럴 땐 int balance에서 static을 쓰면 안 됨
    }
}
