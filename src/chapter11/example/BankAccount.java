package chapter11.example;

public abstract class BankAccount{
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public abstract String getAccountType ();

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
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        if (otherAccount == null) {
            throw new NullPointerException();
        }
        if (withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }
        /*if (amount > 0 && amount < balance) {
            this.balance=this.balance-amount;
            otherAccount.deposit(amount);
            return true;
        } else if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        } else if (otherAccount == null) {
            throw new NullPointerException();
        }
        return false;
    } */
        return false;
    }
        public String toString() {
            return String.format("%,d", getBalance());
        }
    }
