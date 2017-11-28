package d00000.lecture06;

public class Main2 {
    public static void main(String[] args) {
        // これまでの利用の仕方
        // フィールドにセットしないで表示しようとしたらどうなるか確認しよう。
        MedicalRecord mr1 = new MedicalRecord();
        mr1.name = "たろう";
        mr1.weight = 67.8;
        mr1.height = 178.9;
        System.out.println(mr1.name + "のBMIは" + mr1.getBmi() + "です。");

        // フィールドに値をセットするメソッドと情報を文字列で返すメソッドを定義・利用しよう。
        MedicalRecord mr2 = new MedicalRecord();
        mr1.setAllFields("たろう", 67.8, 178.9);
        System.out.println(mr2.getInfo());

        // 引数なしのコンストラクタでフィールドに値をセットしよう。
        MedicalRecord mr3 = new MedicalRecord();
        System.out.println(mr3.getInfo());

        // 引数ありのコンストラクタでフィールドに値をセットしよう。
        MedicalRecord mr4 = new MedicalRecord("じろう", 78.9, 167.8);
        System.out.println(mr4.getInfo());

        // 参照型の配列の初期化
        MedicalRecord[] mrArray = {new MedicalRecord("のびた", 50.0, 150.0), new MedicalRecord("すねお", 60, 160.0), new MedicalRecord("たけし", 70.0, 170.0)};
        for (int i = 0; i < 3; i++) {
            System.out.println(mrArray[i].getInfo());
        }

        // インスタンス名をつけずに実行
        System.out.println((new MedicalRecord("しずか", 40.0, 140)).getInfo());
    }
}
