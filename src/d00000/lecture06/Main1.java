package d00000.lecture06;

import d00000.lecture05.MedicalRecord;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 違うパッケージのクラスを使う
        d00000.lecture05.MedicalRecord mr1 = new d00000.lecture05.MedicalRecord();
        mr1.name = "たろう";
        mr1.weight = 56.7;
        mr1.height = 171.2;
        System.out.println(mr1.name + "のBMIは" + mr1.getBmi() + "です。");

        // import文を使うとパッケージの指定をしなくてすむ。
        // 3行目のimport文の有無でコンパイルが可能かどうか調べよう。
        // またd00000.lecture05.MedicalRecordのフィールドのアクセス修飾子を変更して違いを確かめよう。
        MedicalRecord mr2 = new MedicalRecord();
        mr2.name = "じろう";
        mr2.weight = 58.9;
        mr2.height = 173.5;
        System.out.println(mr2.name + "のBMIは" + mr2.getBmi() + "です。");

        // Scannerの利用例
        Scanner scanner = new Scanner(System.in);
        MedicalRecord mr3 = new MedicalRecord();
        System.out.print("名前を入力してください: ");
        mr3.name = scanner.next();
        System.out.print("体重[kg]を入力してください: ");
        mr3.weight = scanner.nextDouble();
        System.out.print("身長[cm]を入力してください: ");
        mr3.height = scanner.nextDouble();
        System.out.println(mr3.name + "のBMIは" + mr3.getBmi() + "です。");
    }
}
