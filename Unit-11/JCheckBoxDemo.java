import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);

        Container contner = frame.getContentPane();
        contner.setLayout(null);

        JCheckBox checkbox1 = new JCheckBox("JAVA");
        JCheckBox checkbox2 = new JCheckBox("C");
        JCheckBox checkbox3 = new JCheckBox("C++");

        checkbox1.setBounds(100, 50, 120, 30);
        checkbox2.setBounds(100, 100, 120, 30);
        checkbox3.setBounds(100, 150, 120, 30);

        contner.add(checkbox1);
        contner.add(checkbox2);
        contner.add(checkbox3);

        frame.setVisible(true);

    }
}