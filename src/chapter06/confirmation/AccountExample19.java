package chapter06.confirmation;

public class AccountExample19 {
    public static void main(String[] args) {
        Account19 account = new Account19();
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());
        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());
        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());
        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());

    }


}
