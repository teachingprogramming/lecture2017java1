package d00000.exam2.p1;

import java.util.Random;

public class Dice {
    public Random random;

    public Dice(long seed) {
        random = new Random(seed);
    }

    /**
     * サイコロを振る
     * 戻り値はサイコロの目で1から6の乱数
     */
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
