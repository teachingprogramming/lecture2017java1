package d00000.lecture05;

public class Main {

    public static void main(String[] args) {
        // フィールドの利用
        MedicalRecord mr1 = new MedicalRecord();
        mr1.name = "いちろう";
        mr1.height = 172.3;
        mr1.weight = 55.5;
        MedicalRecord mr2 = new MedicalRecord();
        mr2.name = "じろう";
        mr2.height = 184.5;
        mr2.weight = 78.9;
        System.out.println(mr1.name + "の身長は" + mr1.height + "cm、体重は" + mr1.weight + "kgです。");
        System.out.println(mr2.name + "の身長は" + mr2.height + "cm、体重は" + mr2.weight + "kgです。");

        // メソッドの利用(1) 引数が無いメソッドの呼び出し
        double bmi1 = mr1.getBmi();
        String bmiClass1 = mr1.getBmiClass();
        System.out.println(mr1.name + "のBMIは" + bmi1 + "です。");
        System.out.println(mr1.name + "のBMIによる分類は" + bmiClass1 + "です。");
        System.out.println(mr2.name + "のBMIは" + mr2.getBmi() + "です。");
        System.out.println(mr2.name + "のBMIによる分類は" + mr2.getBmiClass() + "です。");

        // メソッドの利用(2) 引数があるメソッドの呼び出し
        double idealBmi = 22.0;
        double idealWeight = mr1.calcIdealWeight(idealBmi);
        System.out.println(mr1.name + "のBMIが" + idealBmi + "になる体重は" + idealWeight + "です。");
        System.out.println(mr2.name + "のBMIが" + idealBmi + "になる体重は" + mr2.calcIdealWeight(idealBmi) + "です。");

        /*
        [課題]
            次の「消費エネルギーの計算」がきちんと実行できるように、MedicalRecordクラスにメソッドを追加しよう。
        [メソッドの仕様]
            引数は「運動時間」と「運動強度（MET）」とし、戻り値は消費エネルギーとする。
            不明な点は参考URL（計算式等）および下記の利用例（メソッド名、引数の型、戻り値の型等）を参照すること。
        [参考URL]
            https://en.wikipedia.org/wiki/Metabolic_equivalent
            http://keisan.casio.jp/exec/system/1161228741
        */
        double hours = 1.5;
        double mets = 2;
        System.out.println(mr1.name + "が" + mets + "METの運動を" + hours + "時間行った時の消費エネルギーは" + mr1.calcEnergyExpenditure(hours, mets) + "kcalです。");
        System.out.println(mr2.name + "が" + mets + "METの運動を" + hours + "時間行った時の消費エネルギーは" + mr2.calcEnergyExpenditure(hours, mets) + "kcalです。");
    }

}
