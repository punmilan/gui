package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JFrame {

    public DrawRectangle(){
        setTitle("DrawRectangle");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.gray);
        g.drawRect(100,40,100,80);
        g.fillRect(170,120,100,120);
    }

    public static void main(String[] args) {
        new DrawRectangle();
    }
}
