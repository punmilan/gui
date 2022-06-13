package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawOval extends JFrame {

    public DrawOval(){
        setTitle("Draw the oval:");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawOval(100,120,140,100);
        g.fillOval(120,130,150,100);
    }


    public static void main(String[] args) {
        new DrawOval();
    }
}
