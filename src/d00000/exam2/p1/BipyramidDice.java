package d00000.exam2.p1;

public class BipyramidDice extends Dice {

    public BipyramidDice(long seed) {
        super(seed);
    }

    @Override
    public int roll() {
        return super.roll() + super.roll() + super.roll() - 2;
    }
}
