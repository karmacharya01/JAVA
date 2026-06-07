
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);

        Container contner = frame.getContentPane();
        contner.setLayout(null);

        contner.setBackground(Color.pink);

        JRadioButton radiobutton1 = new JRadioButton("Male");
        radiobutton1.setBounds(100, 50, 100, 50);
        contner.add(radiobutton1);
        Font f = new Font("arial", Font.ITALIC, 20);
        radiobutton1.setFont(f);

        JRadioButton radiobutton2 = new JRadioButton("Female");
        radiobutton2.setBounds(200, 50, 100, 50);
        contner.add(radiobutton2);
        radiobutton2.setFont(f);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radiobutton1);
        gender.add(radiobutton2);

        frame.setVisible(true);
    }
}