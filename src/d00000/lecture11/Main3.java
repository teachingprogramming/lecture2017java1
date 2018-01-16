package d00000.lecture11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main3 {
    public static void main(String[] args) {
        // JFrameのインスタンス化
        JFrame jFrame = new JFrame();
        // ウィンドウサイズを指定
        jFrame.setSize(300, 200);
        // クローズボタンがクリックされたらプログラムを終了する設定
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // レイアウトマネージャーを使わない（部品で配置する位置を指定）
        jFrame.getContentPane().setLayout(null);
        // フレームを表示
        jFrame.setVisible(true);

        // JButtonをインスタンス化
        JButton jButton = new JButton();
        // ボタンのテキストを設定
        jButton.setText("ここをクリック");
        // ボタンの位置とサイズを指定
        jButton.setBounds(20, 10, 100, 50);
        // ボタンをフレームに追加
        jFrame.getContentPane().add(jButton);
    }
}
