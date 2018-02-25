package d00000.exam2.p2;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable mt1 = new MultiplicationTable(1, 9);
        mt1.print();
        System.out.println("10の倍数の個数: " + mt1.getNumOfMultiple(10));

        System.out.println();

        MultiplicationTable mt2 = new MultiplicationTable(11, 14);
        mt2.print();
        System.out.println("偶数（2の倍数）の個数: " + mt2.getNumOfMultiple(2));
    }
}
