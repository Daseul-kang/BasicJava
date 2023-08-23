package chapter06;

public class BankAccount {
    //잔액
    static int balance;

    //입금
    void deposit(int amount) {
        balance += amount;
    }

    //출금
    void withdraw(int amount) {
        balance -= amount;
    }
}
