package d00000.swingexample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ボタンをクリックするとテキストフィールドの値がラベルに表示される
 *
 * ポイント:
 * 1) テキストフィールドの値はgetTextメソッドで取得できる
 */
public class Example03 extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Example03();
    }

    public JLabel label;
    public JButton button;
    public JTextField textField;

    public Example03() {
        // ウィンドウの設定
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // ラベルの配置
        label = new JLabel();
        label.setText("最初に表示されるテキスト");
        label.setBounds(20, 10, 250, 50);
        getContentPane().add(label);

        // ボタンの配置
        button = new JButton();
        button.setText("ボタン1");
        button.setBounds(20, 70, 100, 50);
        button.addActionListener(this);
        getContentPane().add(button);

        // テキストフィールドの配置
        textField = new JTextField();
        textField.setBounds(20, 130, 250, 50);
        getContentPane().add(textField);

        // フレーム（ウィンドウ）の表示（コンストラクタの最後で実行する）
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // イベントが発生したオブジェクト
        if (source == button) {
            String text = textField.getText();
            label.setText(text);
        } else {
            // ここには来ないはず
            label.setText("何かがクリックされた");
        }
    }
}
