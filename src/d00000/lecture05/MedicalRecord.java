package d00000.lecture05;

/**
 * カルテを表すクラス
 */
public class MedicalRecord {
    /** 名前を格納するフィールド */
    public String name;
    /** 体重を格納するフィールド */
    public double weight;
    /** 身長を格納するフィールド */
    public double height;

    /**
     * BMIを計算する
     * @return BMI
     */
    public double getBmi() {
        double height_m = height * 0.01; // 身長[m]
        return weight / (height_m * height_m);
    }

    /**
     * BMIによる分類（クラス）を返す
     * @return BMIのクラス
     */
    public String getBmiClass() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "痩せ";
        } else if (bmi < 25.0) {
            return "普通";
        } else {
            return "肥満";
        }
    }

    /**
     * 指定したBMIとなる理想の体重を計算する
     * @param bmi 目指すBMI
     * @return 理想の体重
     */
    public double calcIdealWeight(double bmi) {
        double height_m = height * 0.01; // 身長[m]
        return bmi * height_m * height_m;
    }

    /**
     * METsと運動時間[h]から消費エネルギーを計算する
     * @param hours 運動時間[h]
     * @param mets METs
     * @return
     */
    public double calcEnergyExpenditure(double hours, double mets) {
        return mets * weight * hours * 1.05;
    }
}
