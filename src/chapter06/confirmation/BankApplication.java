package chapter06.confirmation;

import java.util.Scanner;

public class BankApplication {
    //20번 모르게써...........................
    public static void main(String[] args) {
        Account20[] account20s = new Account20[100];
        int totalCount = 0;
        Scanner scanner = new Scanner(System.in);

        outer: while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------");
            System.out.print("선택> ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("----------------");
                    System.out.println("    계좌생성");
                    System.out.println("----------------");
                    System.out.print("계좌번호: ");
                    String accountNum = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());
                    account20s[totalCount++] = new Account20(accountNum, accountHolder, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case 2 -> {
                    System.out.println("----------------");
                    System.out.println("    계좌목록");
                    System.out.println("----------------");
                    System.out.println("계좌번호\t계좌주\t잔액");
                    for (Account20 account: account20s) {
                        if (account != null) {
                            System.out.printf("%s\t%s\t%,d\n", account.getAccountNum(), account.getAccountOwner(), account.getBalance());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("----------------");
                    System.out.println("      예금");
                    System.out.println("----------------");
                    System.out.println("계좌번호: ");
                    String searchNumber = scanner.nextLine();
                    System.out.println("예금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    for (Account20 acoount : account20s) {
                        if (acoount != null) {
                            if (acoount.getAccountNum().equals(searchNumber)) {
                                acoount.deposit(amount);
                            }
                        }
                    }
                    System.out.println("입금이 완료되었습니다.");
                }
                case 4 -> {
                    System.out.println("----------------");
                    System.out.println("      출금");
                    System.out.println("----------------");
                    System.out.println("계좌번호: ");
                    String searchNumber = scanner.nextLine();
                    System.out.println("출금액: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    for (Account20 acoount : account20s) {
                        if (acoount != null) {
                            if (acoount.getAccountNum().equals(searchNumber)) {
                                acoount.withdraw(amount);
                            }
                        }
                    }
                    System.out.println("출금이 완료되었습니다.");
                    }
                case 5 -> {
                    break outer;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
