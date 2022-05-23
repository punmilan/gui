package gui;

import javax.swing.*;

public class MyFirst {
    JFrame myfirst;

    // constructor
    public MyFirst(){


        myfirst = new JFrame("Hello world:");
        myfirst.setSize(400,400);
        myfirst.setLocationRelativeTo(null);
        myfirst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myfirst.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFirst();
    }
}
