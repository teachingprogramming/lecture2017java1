package d00000.exam2.p3;

public class GeneralResult extends Result {
    public String name;
    public int exam1;
    public int exam2;
    public int exam3;
    public int exam4;

    public GeneralResult(int credit, String name, int exam1, int exam2, int exam3, int exam4) {
        this.unit = credit;
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
        this.exam4 = exam4;
    }

    @Override
    public double getScore() {
        return (exam1 + exam2 + exam3 + exam4) * 0.25;
    }

    @Override
    public String toString() {
        return name;
    }
}
