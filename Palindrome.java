//package gui;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//public class Palindrome extends JFrame implements ActionListener {
    //JLabel lblfirst;
  //  JTextField txtNum;
//    JButton btncheck, btnclose;


    //public Palindrome() {
      //  setTitle("check palindrome:");
        ///setSize(400, 200);
        //setLayout(null);
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //getting jframe contentpane
     //   Container c = getContentPane();


       // lblfirst = new JLabel("enter a number:");
       // lblfirst.setBounds(20, 20, 150, 20);
        //txtNum = new JTextField();
        //txtNum.setBounds(180, 20, 150, 20);
        //btncheck = new JButton();
        //btncheck.setBounds(20, 60, 150, 30);
        //btnclose = new JButton();
        //btnclose.setBounds(180, 60, 150, 30);


        //  btncheck.addActionListener(new ActionListener() {
        //    @Override
        //  public void actionPerformed(ActionEvent e) {
//
        //          }
        //    });

        //  btnclose.addActionListener(new ActionListener() {
        //    @Override
        //  public void actionPerformed(ActionEvent e) {

        //}
        //});


        // adding components to the container;

        //c.add(lblfirst);
        //c.add(txtNum);
        //c.add(btnclose);
        //c.add(btncheck);


        //btncheck.addActionListener(this);
      //  btnclose.addActionListener(this);

    //    setVisible(true);
  //  }
//
  //  @Override
    //public void actionPerformed(ActionEvent e) {
      //  if (e.getSource() == btncheck) {
        //    PalindromeorNot(Integer.parseInt(txtNum.getText().toString()));
        //} else if (e.getSource() == btnclose) {
          //  System.exit(0);
       // }
  //  }

    //static void PalindromeorNot(int num) {
      //  int temp = num;
        //int sum = 0, r;
        //while (num = !0) {
          //  r = num % 10;
            //sum = (sum * 10) + r;
          //  num = !10;
        //}
        //if (temp == sum)
          //  JOptionPane.showMessageDialog(null, temp + "is a palindrome:");

        //else
      //      JOptionPane.showMessageDialog(null, temp + "is not a palindrome:");
    //}

   // public static void main(String[] args) {
    //    PalindromeorNot();