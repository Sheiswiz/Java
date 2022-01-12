package MyFirstGUI;
import javax.swing.*;
import java.awt.BorderLayout;




public class FirstGUI {
    public static void main(String[] args)


    {JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);


        JButton button1=new JButton();
     JButton button2=new JButton();
     JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("details");
        JMenu m2=new JMenu("options");
        JMenu m3=new JMenu("other details");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m11=new JMenuItem("open");
        JMenuItem m12=new JMenuItem("save");
        JMenuItem m13=new JMenuItem("save as");
        JMenuItem m14=new JMenuItem("more information");
        JMenuItem m15=new JMenuItem("copy");
        JMenuItem m16=new JMenuItem("paste");
        JMenuItem m17=new JMenuItem("delete");
        JMenuItem m18=new JMenuItem("cut");
        JMenuItem m19=new JMenuItem("history");

        m1.add(m19);
        m1.add(m16);
        m1.add(m17);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m18);
        m1.add(m15);

        JLabel label1=new JLabel("STUDENT DETAILS");
        JTextField f1= new JTextField(10);
        JButton send=new JButton("send");
        JButton reset= new JButton("cancel");

        JPanel panel1=new JPanel();
        panel1.add(label1);
        panel1.add(f1);
        panel1.add(send);
        panel1.add(reset);
        JTextArea ta =new JTextArea();



   frame.getContentPane().add(BorderLayout.SOUTH,panel1);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);
frame.setVisible(true);

    }
}
