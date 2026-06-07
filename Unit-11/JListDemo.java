import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListDemo extends JFrame {

    String[] items = {
            "JAVA", "C++", "PHP", "C", "C#",
            "DRUPAL", "PYTHON",
            "JavaScript", "HTML", "CSS"
    };

    public JListDemo() {

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JList<String> list = new JList<>(items);
        list.setVisibleRowCount(3);

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JListDemo();
    }
}