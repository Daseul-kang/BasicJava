package chapter06.confirmation;

public class Account20 {
    private String accountNum; //계좌번호
    private String accountHolder; //계좌주
    private int balance; //잔액

    //기본 생성자
    public Account20() {

    }

    public Account20(String accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }
    public String getAccountOwner() {
        return accountHolder;
    }
    public void setAccountOwner(String accountOwner) {
        this.accountHolder = accountHolder;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //입금 메소드
    public void deposit(int amount){
        balance += amount;
    }

    //출금 메소드
    public void withdraw(int amount) {
        balance -= amount;
    }
}




