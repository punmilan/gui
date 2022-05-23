package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jpanel extends JFrame implements ActionListener {
    JPanel panel1;
    JPanel panel2;
    //JFrame Frame = new JFrame("Open");
    Container c;
    JButton btn1, btn2;
    JLabel lbl1,lbl2;

    public Jpanel(){
        setTitle("Jpanel Test");
        setLayout(null);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        btn1 = new JButton("Button1");
        btn1.setBounds(10,20,100,30);

        btn2 = new JButton("Button2");
        btn2.setBounds(10,20,100,30);

        lbl1 = new JLabel("label1");
        lbl1.setBounds(120,10,100,30);

        lbl2  = new JLabel("label2");
        lbl2.setBounds(120,10,100,30);

        panel1 = new JPanel();
        setLayout(null);
        panel1.setBounds(20,10,250,200);

        panel2 = new JPanel();
        setLayout(null);
        panel2.setBounds(290,10,250,200);

        btn1.addActionListener(this);

        c.add(panel1);
        c.add(panel2);

        panel1.add(btn1);
        panel1.add(lbl1);
        panel2.add(btn2);
        panel2.add(lbl2);

        Border blackline1 = BorderFactory.createTitledBorder("Panel1");
        Border blackline2 = BorderFactory.createTitledBorder("panel2");

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new Jpanel();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
