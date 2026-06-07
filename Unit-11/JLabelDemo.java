import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        Container contner = frame.getContentPane();
        contner.setLayout(null);

        contner.setBackground(Color.pink);
        JLabel label = new JLabel("A Basic Label");
        Font f = new Font("arial", Font.BOLD, 25);

        label.setFont(f);

        label.setBounds(100, 100, 300, 30);

        contner.add(label);
        frame.setVisible(true);
    }
}
