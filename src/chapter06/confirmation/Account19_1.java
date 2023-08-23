package chapter06.confirmation;

public class Account19_1 {
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1_000_000;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }
}

