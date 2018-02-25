package d00000.exam2.p3;

public class Main {
    public static void main(String[] args) {
        Result[] results = new Result[5];
        results[0] = new D4Java1(61, 72, 83); // 中間61点、期末72点、課題83点
        results[1] = new D5Java2(75, 88); // 試験75点、課題88点
        results[2] = new GeneralResult(4, "D1 英語", 60, 74, 86, 90);
        results[3] = new GeneralResult(8, "D2 数学", 35, 60, 70, 25);
        results[4] = new GeneralResult(4, "D3 国語", 60, 55, 70, 65);

        System.out.println("教科と点数");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
            System.out.print(", ");
            System.out.println(results[i].getScore());
        }
        System.out.println();

        GradeReport gr = new GradeReport(results);
        System.out.println("修得単位数: " + gr.getTotalCredits());
        System.out.println("卒業可能か: " + gr.canGraduate());
    }
}
