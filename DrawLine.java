package graphics;

import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame {

    public DrawLine(){
        setTitle("Drawline");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.drawLine(100,100,200,200);

    }

    public static void main(String[] args) {
        new DrawLine();
    }
}
