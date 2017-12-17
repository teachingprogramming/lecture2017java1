package d00000.exam1.p1;

public class TallyCounter {
    public int initial;
    public boolean countUp;
    public int current;

    public TallyCounter(int initial, boolean countUp) {
        this.initial = initial;
        this.countUp = countUp;
        this.current = initial;
    }

    public void count() {
        if (countUp) {
            current++;
        } else {
            current--;
        }
    }

    public void multicount(int value) {
        for (int i = 0; i < value; i++) {
            count();
        }
    }

    public void reset() {
        current = initial;
    }
}
