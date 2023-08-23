package chapter07.exercise.newbank;


public class CheckingAccount extends BankAccount {
    private SavingsAccount protectedBy;

    public CheckingAccount(int balance) {
        super(balance);
    }
    public CheckingAccount(int balance, SavingsAccount protectedBy) {
        super(balance);
        this.protectedBy = protectedBy;
    }
    public boolean withdraw(int amount) {
        if (balance < amount) {
            // protectedBy.balance -= amount - balance;
            protectedBy.withdraw(amount - balance);
            balance = 0;
            return true;
        }
        return super.withdraw(amount);
    }
}
