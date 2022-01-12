import javax.swing.*;
import java.awt.*;

public class newaction {
    public static void main(String[] args)


    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);


        JPanel J1=new JPanel();
        JLabel num=new JLabel("num:");
        JLabel result=new JLabel();

        JTextField t1=new JTextField(30);
        JButton button1=new JButton("press me");
        J1.add(num);
        J1.add(result);
        J1.add(t1);
        J1.add(button1);
        JTextArea ta =new JTextArea();

        frame.getContentPane().add(BorderLayout.NORTH,J1);
        frame.getContentPane().add(BorderLayout.CENTER,ta);

        frame.setVisible(true);


    }
}


