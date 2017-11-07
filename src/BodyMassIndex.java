/**
 * BMIを計算する
 * 注意: OOPとしては不適切
 */
class BodyMassIndex {
    /**
     * メインメソッド
     */
    public static void main(String[] args) {
        // 体重を格納する配列
        double[] weight = new double[3];
        weight[0] = 44.5;
        weight[1] = 90.2;
        weight[2] = 72.5;

        // 体重を表示する
        for (int i = 0; i < 3; i++) {
            System.out.println("番号" + i + "の体重は" + weight[i] + "kgです。");
        }

        // 身長を格納する配列
        double[] height = {181.2, 167.5, 175.0};

        // 身長を表示する
        for (int i = 0; i < 3; i++) {
            System.out.println("番号" + i + "の身長は" + height[i] + "cmです。");
        }

        // BMIを格納する配列
        double[] bmi = new double[3];

        // BMIを計算して格納する
        for (int i = 0; i < 3; i++) {
            bmi[i] = calc(weight[i], height[i]);
        }

        // BMIを表示する
        for (int i = 0; i < 3; i++) {
            String category = classify(bmi[i]);
            System.out.println("番号" + i + "のBMIは" + bmi[i] + "で、カテゴリーは「" + category + "」です。");
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

    /**
     * BMIからカテゴリーに分類するメソッド
     * TODO カテゴリーの追加
     *
     * @param b BMI
     * @return カテゴリー
     */
    static String classify(double b) {
        if (18.5 <= b && b < 25.0) {
            return "普通体重です";
        } else {
            return "普通体重ではありません";
        }
    }

}
