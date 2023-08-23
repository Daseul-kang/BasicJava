package chapter06.confirmation;

public class Account19 {
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1_000_000;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance <= MIN_BALANCE) {
            this.balance += 0;
        } else if (balance >= MAX_BALANCE) {
            this.balance += 0;
        } else {
            this.balance = balance;
            return;
        }
    }
}

