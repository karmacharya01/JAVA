import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container contner = frame.getContentPane();
        contner.setLayout(null);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 50, 120, 30);
        contner.add(pass);
        pass.setEchoChar('*');
        frame.setVisible(true);
    }
}