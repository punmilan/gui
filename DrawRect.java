package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawRect extends JFrame {

    public DrawRect(){
        setTitle("Draw the rectangle:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(100,150,200,150);
        g.fillRect(120,100,120,130);
    }


    public static void main(String[] args) {
        new DrawRect();
    }
}
