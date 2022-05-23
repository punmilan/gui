package gui;

import javax.swing.*;

public class Hellloworld {
    JFrame myframe;
    JLabel lblfirst,lblsecond;


    //constructor
    public Hellloworld(){
        myframe = new JFrame("Hello world:");
        myframe.setSize(400,200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLocationRelativeTo(null);

        myframe.setLayout(null);
        lblfirst = new JLabel("I love u:");
        lblfirst.setBounds(20,20,30,180);


        lblsecond = new JLabel("Hello world:");
        lblsecond.setBounds(20,60,150,150);


        myframe.add(lblfirst);
        myframe.add(lblsecond);
    }

    public static void main(String[] args) {
        new Hellloworld();
    }
}
