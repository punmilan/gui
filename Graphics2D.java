package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Graphics2D extends JFrame {


    public Graphics2D(){
        setTitle("Graphics 2D:");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        Rectangle2D r = new Rectangle2D.Double(120,100,200,100);
        RoundRectangle2D rr = new RoundRectangle2D.Double(120,100,200,100,30,30);
        java.awt.Graphics2D d = (java.awt.Graphics2D) g;
        ((java.awt.Graphics2D) g).setStroke(new BasicStroke(6));
        ((java.awt.Graphics2D) g).draw(r);
        ((java.awt.Graphics2D) g).draw(rr);
    }


    public static void main(String[] args) {
        new Graphics2D();
    }


}
