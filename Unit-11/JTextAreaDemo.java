import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);

        Container contner = frame.getContentPane();
        contner.setLayout(null);
        contner.setBackground(Color.pink);

        JTextArea textarea = new JTextArea();
        textarea.setBounds(100, 100, 300, 200);
        contner.add(textarea);

        textarea.setText("This is a JTextArea");

        frame.setVisible(true);
    }
}