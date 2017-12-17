package d00000.exam1.p1;

public class Main {
    public static void main(String[] args) {
        TallyCounter tc1 = new TallyCounter(0, true);
        System.out.println("tc1のカウント値: " + tc1.current);
        tc1.count();
        tc1.count();
        tc1.multicount(7);
        System.out.println("tc1のカウント値: " + tc1.current);
        tc1.reset();
        System.out.println("tc1のカウント値: " + tc1.current);
        tc1.multicount(5);
        tc1.multicount(-3);
        System.out.println("tc1のカウント値: " + tc1.current);

        System.out.println(); // 空行

        TallyCounter tc2 = new TallyCounter(20, false);
        System.out.println("tc2のカウント値: " + tc2.current);
        tc2.count();
        tc2.count();
        tc2.multicount(5);
        System.out.println("tc2のカウント値: " + tc2.current);
        tc2.reset();
        System.out.println("tc2のカウント値: " + tc2.current);
        tc2.multicount(7);
        tc2.multicount(-4);
        System.out.println("tc2のカウント値: " + tc2.current);
    }
}
