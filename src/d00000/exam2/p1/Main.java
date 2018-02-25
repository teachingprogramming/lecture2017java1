package d00000.exam2.p1;

public class Main {
    public static void main(String[] args) {

        // 普通のサイコロを20回振る
        Dice dice = new Dice(0L);
        for (int i = 0; i < 20; i++) {
            System.out.print(dice.roll() + " ");
        }
        System.out.println();

        // シゴロ賽を20回振る
        ShigoroDice shigoroDice = new ShigoroDice(0L);
        for (int i = 0; i < 20; i++) {
            System.out.print(shigoroDice.roll() + " ");
        }
        System.out.println();

        // 16面ダイスを20回振る
        BipyramidDice bipyramidDice = new BipyramidDice(0L);
        for (int i = 0; i < 20; i++) {
            System.out.print(bipyramidDice.roll() + " ");
        }
        System.out.println();

    }
}
