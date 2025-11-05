package b.oop.practice;

public class BankAccount {

    // 문제 4: BankAccount 클래스
    // 은행 계좌를 나타내는 클래스를 만드세요.

    // 요구사항:
    // 필드: accountNumber (String), balance (int)
    // 생성자: 계좌번호와 초기 잔액을 받는 생성자
    // 메서드:
    // deposit(int amount): 입금
    // withdraw(int amount): 출금
    // getBalance(): 잔액 반환

    String accountNumber;
    int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금: " + amount + "원, 잔액: " + balance);
    }
    void withdraw(int amount) {
        balance -= amount;
        System.out.println("출금: " + amount + "원, 잔액: " + balance);
    }
    void getBalance() {
        System.out.println(balance);
    }

}
