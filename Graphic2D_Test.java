//package graphics;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.geom.Rectangle2D;
//import java.awt.geom.RoundRectangle2D;
//
//public class Graphic2D_Test extends JFrame {
//
//    public Graphic2D_Test(){
//        setTitle("Graphic 2D:");
//         setSize(400,400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setVisible(true);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setColor(Color.red);
//        Rectangle2D r =  new Rectangle2D.Double(120,100,200,100);
//      //  Graphics2D d = (Graphics2D) g;
//        d.draw(new RoundRectangle2D.Double(120,100,200,100,30,30));
//
//    }
//
//    public static void main(String[] args) {
//        new Graphic2D_Test();
//    }
//}
