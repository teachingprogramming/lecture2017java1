package d00000.swingexample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * ボタンを表示する（d00000.lecture12.Main3をJFrameの継承で書き直し）
 * 注意:
 * 起動の方法は https://docs.oracle.com/javase/jp/8/docs/api/javax/swing/package-summary.html
 * に書かれている方法が正しいが、ここでは初学者に対するわかりやすさのため、この方法で起動はしない。
 */
public class Example01 extends JFrame {

    public static void main(String[] args) {
        new Example01();
    }

    public Example01() {
        // ウィンドウサイズを指定
        setSize(300, 200);
        // クローズボタンがクリックされたらプログラムを終了する設定
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // レイアウトマネージャーを使わない（部品で配置する位置を指定）
        getContentPane().setLayout(null);

        // JButtonをインスタンス化
        JButton jButton = new JButton();
        // ボタンのテキストを設定
        jButton.setText("ここをクリック");
        // ボタンの位置とサイズを指定
        jButton.setBounds(20, 10, 100, 50);
        // ボタンをフレームに追加
        getContentPane().add(jButton);

        // フレーム（ウィンドウ）の表示（コンストラクタの最後で実行する）
        setVisible(true);
    }
}
