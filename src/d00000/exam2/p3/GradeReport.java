package d00000.exam2.p3;

public class GradeReport {
    public Result[] results;
    public GradeReport(Result[] results) {
        this.results = results;
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (Result result : results) {
            if (result.getScore() >= 60) {
                totalCredits += result.unit;
            }
        }
        return totalCredits;
    }

    public boolean canGraduate() {
        return getTotalCredits() >= 10;
    }

}
