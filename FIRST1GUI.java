package gui;

import javax.swing.*;

public class FIRST1GUI {
    JFrame myframe;
    JLabel lblMsg;
    //constructor
    public FIRST1GUI(){
        myframe = new JFrame("my first love:");
        myframe.setSize(500,200);
        myframe.setVisible(true);
        myframe.setLocationRelativeTo(null);
       myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       myframe.setLayout(null);
       lblMsg = new JLabel("hello world:");
       lblMsg.setBounds(20,20,150,180);

       myframe.add(lblMsg);
   }


      public static void main(String[] args) {
      new  FIRST1GUI();
    }
}





//public class FirstGUI1{
///
   // JFrame myfirstframe;
    // constructor

    //public  FirstGUI1(){
      //  myfirstframe = new JFrame("i love u:");
       // myfirstframe.setSize(400,200);
        //myfirstframe.setVisible(true);
       // myfirstframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myfirstframe.setLocationRelativeTo(null);
            //}
    //public static void main(String[] args) {
    //  new FirstGUI1();
   // }
//}