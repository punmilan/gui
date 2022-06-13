package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouseclickin extends JFrame implements MouseListener {


    public Mouseclickin(){
        setTitle("draw the rect with the mouse click:");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.drawRect(e.getX(),e.getY(),100,100);
        g.fillRect(e.getX(),e.getY(),100,100);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public static void main(String[] args) {
        new Mouseclickin();
    }
}
