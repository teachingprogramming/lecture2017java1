package d00000.exam2.p1;

public class ShigoroDice extends Dice {

    public ShigoroDice(long seed) {
        super(seed);
    }

    @Override
    public int roll() {
        int value = super.roll();
        if (value <= 3) {
            value += 3;
        }
        return value;
    }
}
