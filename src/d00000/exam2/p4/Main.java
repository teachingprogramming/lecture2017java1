package d00000.exam2.p4;

public class Main {
    public static void main(String[] args) {
        boolean result;

        // 口座開設
        BankAccount ba1 = new BankAccount("rYkE");
        System.out.println("残高: " + ba1.balance);

        // 1000円入金
        ba1.deposit(1000);
        System.out.println("残高: " + ba1.balance);

        // 2000円出金（成功）
        result = ba1.withdrew(2000, "rYkE");
        System.out.println("出金できたか: " + result);
        System.out.println("残高: " + ba1.balance);

        // 2000円出金（パスワードが違うため失敗）
        result = ba1.withdrew(2000, "OkGw");
        System.out.println("出金できたか: " + result);
        System.out.println("残高: " + ba1.balance);

        // 30000円出金（残高が足りないため失敗）
        result = ba1.withdrew(30000, "rYkE");
        System.out.println("出金できたか: " + result);
        System.out.println("残高: " + ba1.balance);
    }
}
