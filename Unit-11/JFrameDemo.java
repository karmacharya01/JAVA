import javax.swing.JFrame;

public class JFrameDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setTitle("This is a JFrame");
        frame.setVisible(true);

    }
}