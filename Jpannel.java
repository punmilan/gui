package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Jpannel extends JFrame implements ActionListener {
    JPanel panel1;
    JPanel panel2;
    Container c;
    JLabel lblfirst,lblsecond;
  //  JButton btn1,btn2;
    //JLabel

    public Jpannel(){
        setTitle("I Love U:");
        setLayout(null);
        setSize(400,400);

        panel1 = new JPanel();
        setLayout(null);
        panel1.setBounds(10,10,200,200);

        panel2 = new JPanel();
        setLayout(null);
        panel2.setBounds(10,250,200,200);

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);

        lblfirst = new JLabel();
        lblfirst.setBounds(20,20,100,30);
        lblsecond = new JLabel();
        lblsecond.setBounds(20,20,100,30);


        c.add(panel1);
        c.add(panel2);
        c.add(lblfirst);
        c.add(lblsecond);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Jpannel();
    }
}
