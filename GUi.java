package gui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUi extends JFrame implements ActionListener {
   
    JLabel lblfirst,lblsecond,lblResult;
    JTextField txtfirst,txtsecond;
    JButton btnAdd,btnSubtract;


    public GUi(){
        setTitle("I Love U:");
        setSize(400,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Container c = new Container();

      setLayout(null);
        lblfirst = new JLabel("enter the first:");
        lblfirst.setBounds(20,20,150,30);
        lblsecond = new JLabel("enter the second:");
        lblsecond.setBounds(20,60,150,30);

       txtfirst = new JTextField();
        txtfirst.setBounds(180,20,150,30);
        txtsecond = new JTextField();
        txtsecond.setBounds(180,60,150,30);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(20,100,150,30);
        btnSubtract = new JButton("subtract");
        btnSubtract.setBounds(60,100,180,30);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        int first = Integer.parseInt(txtfirst.getText());
        int second = Integer.parseInt(txtsecond.getText());
        int result = add(first,second);
       // int result=(Integer.toString(Result));

        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




        c.add(lblfirst);
        c.add(lblsecond);
        c.add(txtfirst);
        c.add(txtsecond);
        c.add(btnAdd);
        c.add(btnSubtract);
        c.add(lblResult);

        lblResult = new JLabel("Result:");
        lblResult.setBounds(20,140,300,30);



    }

    public static int add(int first,int second){
        int result = first + second;
        return result;
    }


    public static void main(String[] args) {
        new GUi();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
    