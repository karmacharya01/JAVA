import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        Container contner = frame.getContentPane();
        contner.setLayout(null);

        JTextField textfield = new JTextField();
        textfield.setBounds(100, 70, 150, 50);
        textfield.setText("JTextField");

        contner.add(textfield);
        frame.setVisible(true);

    }
}