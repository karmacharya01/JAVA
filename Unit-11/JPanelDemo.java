import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("JPanel Example");
        Container contner = frame.getContentPane();
        contner.setBackground(Color.WHITE);
        contner.setLayout(null);

        JPanel panelFirst = new JPanel();
        panelFirst.setBounds(0, 0, 300, 300);
        panelFirst.setBackground(Color.pink);
        contner.add(panelFirst);

        JPanel panelSecond = new JPanel();
        panelSecond.setBounds(300, 0, 200, 200);
        panelSecond.setBackground(Color.RED);
        contner.add(panelSecond);
    }
}


