package d00000.lecture04;

public class Main {

    public static void main(String[] args) {
        // カルテの作成
        MedicalRecord mr1 = new MedicalRecord();
        mr1.name = "たろう";
        mr1.height = 178.9;
        mr1.weight = 65.8;

        // カルテとBMIの表示
        System.out.println(mr1.name + "の身長は" + mr1.height + "cm、体重は" + mr1.weight + "kgです。");
        System.out.println(mr1.name + "のBMIは" + calc(mr1.weight, mr1.height) + "です。");

        // カルテの配列の作成
        MedicalRecord[] mrArray = new MedicalRecord[3];

        mrArray[0] = new MedicalRecord();
        mrArray[0].name = "いちろう";
        mrArray[0].height = 160.0;
        mrArray[0].weight = 60.0;

        mrArray[1] = new MedicalRecord();
        mrArray[1].name = "じろう";
        mrArray[1].height = 170.0;
        mrArray[1].weight = 70;

        mrArray[2] = new MedicalRecord();
        mrArray[2].name = "さぶろう";
        mrArray[2].height = 180.0;
        mrArray[2].weight = 80.0;

        // カルテとBMIの表示
        for (int i = 0; i < 3; i++) {
            System.out.println(mrArray[i].name + "の身長は" + mrArray[i].height + "cm、体重は" + mrArray[i].weight + "kgです。");
            System.out.println(mrArray[i].name + "のBMIは" + calc(mrArray[i].weight, mrArray[2].height) + "です。");
        }

    }

    /**
     * BMIを計算するメソッド
     *
     * @param w 体重[kg]
     * @param h 身長[cm]
     * @return BMI
     */
    static double calc(double w, double h) {
        double h_m = h * 0.01; // 身長[m]
        return w / (h_m * h_m);
    }

}
