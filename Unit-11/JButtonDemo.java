import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        Container contner = frame.getContentPane();
        contner.setLayout(null);

        JButton btn = new JButton("Click Here");
        btn.setSize(150, 50);
        btn.setLocation(150, 150);
        contner.add(btn);

        Font fnt = new Font("Arial", Font.BOLD, 20);
        btn.setFont(fnt);
        // btn.setText("OK");

        Cursor crsor = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(crsor);

        // btn.setEnabled(false);
        // btn.setVisible(true);
        // btn.setVisible(false);

        frame.setVisible(true);
    }
}