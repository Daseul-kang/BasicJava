package chapter07.exercise.newbank;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(int balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    public void updateBalance(int period) {
//  틀렸음  balance += (int) (balance * interestRate * period);
        this.balance += this.balance * interestRate * period;
    }

}
