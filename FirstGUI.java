package gui;

import javax.swing.*;

public class FirstGUI {
    JFrame myframe;
    //consturctor


    public FirstGUI() {
        myframe = new JFrame("my first frame:");
        myframe.setSize(400, 300);
        myframe.setVisible(true);
        myframe.setLocationRelativeTo(null);
         myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FirstGUI();
    }

}
