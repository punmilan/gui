package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawString extends JFrame {

    public DrawString(){
        setTitle("DrawString in the java:");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello World",130,200);
    }

    public static void main(String[] args) {
        new DrawString();
    }
}
