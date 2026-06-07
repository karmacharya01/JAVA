import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

    public static void main(String[] args) {

        String[][] recod = {

                { "100", "Abhiraj", "20" },
                { "101", "Ananya", "23" },
                { "102", "Rahul", "25" },
                { "103", "Bipin", "27" },
                { "104", "Binya", "28" }, };

        String[] columnNames = { "ID", "NAME", "AGE" };

        JTable table = new JTable(recod, columnNames);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);

        frame.setTitle("This is a JTable");

        frame.add(new JScrollPane(table));

        frame.setVisible(true);

    }
}