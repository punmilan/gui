package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawString_Test extends JFrame {

    public DrawString_Test(){
        setTitle("DrawString with set fonts and color:");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.setFont(new Font("Arial",Font.BOLD,24));
        g.drawString("Hello World",100,100);
    }

    public static void main(String[] args) {
        new DrawString_Test();
    }
}
