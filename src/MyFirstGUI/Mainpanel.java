package MyFirstGUI;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainpanel extends JPanel {

    private JLabel num;
    private JTextField t1;
    private JLabel result;
    private JButton b1;

    public Mainpanel() {
        num = new JLabel("num:");
        t1 = new JTextField(30);
        result = new JLabel();
        b1 = new JButton("press me");
        add(num);
        add(t1);
        add(result);
        add(b1);
        b1.addActionListener(new ButtonListener());
    }

        private class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){

           int data = Integer.parseInt(t1.getText());
                result.setText(""+data*2);

            }

        }
    }

