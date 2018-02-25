package d00000.exam2.p4;

public class BankAccount {
    public int balance;
    public String password;

    public BankAccount(String password) {
        this.password = password;
        this.balance = 10000;
    }

    public void deposit(int money) {
        balance += money;
    }

    public boolean withdrew(int money, String password) {
        if (this.password.equals(password)) {
            if (balance >= money + 100) {
                balance -= money + 100;
                return true;
            }
        }
        return false;
    }

}
