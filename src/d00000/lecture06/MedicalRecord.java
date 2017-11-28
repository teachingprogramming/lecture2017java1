package d00000.lecture06;

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
     * @param mets  METs
     * @return 消費エネルギー
     */
    public double calcEnergyExpenditure(double hours, double mets) {
        return mets * weight * hours * 1.05;
    }

    /**
     * 全てのフィールドを一度にセットするメソッド
     * @param name 名前
     * @param weight 体重
     * @param height 身長
     */
    public void setAllFields(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    /**
     * インスタンスの情報を文字列（String）で返すメソッド
     * @return
     */
    public String getInfo() {
        String formattedBmi = String.format("%.2f", getBmi());
        String info = name + "のBMIは" + formattedBmi + "です。";
        return info;
    }

    /**
     * 引数なしのコンストラクタ
     */
    public MedicalRecord() {
        // 最初は下記のコメントを外して、インスタンス化時に実行されることを確認しよう。
        // System.out.println("引数なしのコンストラクタが実行されました。");
        name = "たろう";
        weight = 56.7;
        height = 177.7;
        // 下記のようにsetAllFieldsを使ってもよい。
        // setAllFields("たろう", 56.7, 177.7);
    }

    /**
     * 3つの引数（フィールドの初期値）があるコンストラクタ
     * @param name 名前
     * @param weight 体重
     * @param height 身長
     */
    public MedicalRecord(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        // setAllFields(name, weight, height);
    }

}
