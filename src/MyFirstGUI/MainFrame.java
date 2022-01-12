package MyFirstGUI;

import javax.swing.*;

public class MainFrame {
    public static  void main (String [] args){

        JFrame J1 =new JFrame();


        J1.setVisible(true);
        J1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J1.setSize(500,500);

        J1.getContentPane().add(new Mainpanel());

    }

}
