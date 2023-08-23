package chapter07.exercise.newbank;

public class BankAccount {
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(int amount, BankAccount otherAccount) {
        if (withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return String.format("%,d", getBalance());
    }
}
