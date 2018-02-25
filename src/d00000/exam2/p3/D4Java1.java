package d00000.exam2.p3;

public class D4Java1 extends Result {
    public int exam1;
    public int exam2;
    public int homework;

    public D4Java1(int exam1, int exam2, int homework) {
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.homework = homework;
        unit = 2;
    }

    @Override
    public double getScore() {
        return exam1 *0.3 + exam2 * 0.5 + homework * 0.2;
    }

    @Override
    public String toString() {
        return "D4 Java I";
    }
}
