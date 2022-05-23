package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends JFrame implements ActionListener {

    JPanel panelfirst;
    JPanel panelsecond;

    JButton btnfirst,btnsecond;
    JLabel lblfirst,lblsecond;


    Container c;

    public First(){
        setTitle("Hello World:");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = getContentPane();

        panelfirst = new JPanel();
        setLayout(null);
        setBounds(10,10,200,200);

        panelsecond = new JPanel();
        setLayout(null);
        setBounds(10,250,200,200);

        btnfirst = new JButton("Button");
        setBounds(10,10,100,30);

        btnsecond = new JButton("Button2");
        setBounds(10,20,100,30);

        lblfirst = new JLabel("Label");
        setBounds(120,10,100,30);

        lblsecond = new JLabel("label2");
        setBounds(120,10,100,30);

        btnfirst.addActionListener(this);

        c.add(panelfirst);
        c.add(panelsecond);
        panelfirst.add(btnfirst);
        panelfirst.add(lblfirst);
        panelsecond.add(btnsecond);
        panelsecond.add(lblsecond);

        Border backline1 = BorderFactory.createTitledBorder("panelfirst");
        Border backline2 = BorderFactory.createTitledBorder("panelsecond");

        panelfirst.setBackground(Color.red);
        panelsecond.setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new First();
    }
}
