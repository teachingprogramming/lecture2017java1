package d00000.swingexample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ボタンをクリックするとラベルの表示が変化する
 *
 * ポイント:
 * 1) 部品（ラベルとボタン）をメンバーにしている
 * 2) ボタンのリスナー（イベントが発生した時に実行するオブジェクト）としてthisを指定している
 * 3) this（つまりSample02クラス）がActionListenerインターフェースを実装している
 */
public class Example02 extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Example02();
    }

    public JLabel label;
    public JButton button1;
    public JButton button2;

    public Example02() {
        // ウィンドウの設定
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // ラベルの配置
        label = new JLabel();
        label.setText("最初に表示されるテキスト");
        label.setBounds(20, 10, 250, 50);
        getContentPane().add(label);

        // ボタン1の配置
        button1 = new JButton();
        button1.setText("ボタン1");
        button1.setBounds(20, 70, 100, 50);
        button1.addActionListener(this);
        getContentPane().add(button1);

        // ボタン2の配置
        button2 = new JButton();
        button2.setText("ボタン2");
        button2.setBounds(20, 130, 100, 50);
        button2.addActionListener(this);
        getContentPane().add(button2);

        // フレーム（ウィンドウ）の表示（コンストラクタの最後で実行する）
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // イベントが発生したオブジェクト
        if (source == button1) {
            label.setText("ボタン1がクリックされた");
        } else if (source == button2) {
            label.setText("ボタン2がクリックされた");
        } else {
            // ここには来ないはず
            label.setText("何かがクリックされた");
        }
    }
}
