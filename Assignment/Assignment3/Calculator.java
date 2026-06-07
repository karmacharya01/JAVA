import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t1,t2;
    JButton add,sub;

    Calculator(){

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add = new JButton("Add");
        sub = new JButton("Subtract");

        add.addActionListener(this);
        sub.addActionListener(this);

        setLayout(new java.awt.FlowLayout());

        add(t1);
        add(t2);
        add(add);
        add(sub);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource()==add)
            JOptionPane.showMessageDialog(this,"Sum = "+(a+b));
        else
            JOptionPane.showMessageDialog(this,"Difference = "+(a-b));
    }

    public static void main(String[] args){
        new Calculator();
    }
}