import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is a JCombo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        Container contner = frame.getContentPane();
        contner.setLayout(null);

        String values[] = { "Java", "C++", "C", "PHP", "Android" };
        final JComboBox combobox = new JComboBox(values);
        combobox.setBounds(50, 50, 90, 30);
        contner.add(combobox);

        Font fnt = new Font("Arial", Font.BOLD, 20);
        combobox.setFont(fnt);

        JButton btn = new JButton("Ok");
        btn.setBounds(300, 100, 100, 30);
        contner.add(btn);

        final JLabel label = new JLabel();
        label.setBounds(100, 300, 100, 30);
        contner.add(label);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String selectitem = (String) combobox.getSelectedItem();
                label.setText(selectitem);
            }
        });

        frame.setVisible(true);
    }
}