package d00000.exam2.p3;

/**
 * D5 Java IIの成績を表すクラス
 * 中間試験と課題の点数の平均を成績とする（期末試験は行わない）
 */
public class D5Java2 extends Result {
    public int exam;
    public int homework;

    public D5Java2(int exam, int homework) {
        this.exam = exam;
        this.homework = homework;
        unit = 2;
    }

    @Override
    public double getScore() {
        return (exam + homework) * 0.5;
    }

    @Override
    public String toString() {
        return "D5 Java II";
    }
}
