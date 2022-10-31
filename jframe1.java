import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class jframe1 extends JFrame 
{
    JFrame j1;
    //JLabel jl1,jl2;
    //JButton login;
    //JTextField jf1;
    JTextArea ja1;

    public jframe1()
    {
        /*jl1=new JLabel("FIRST NAME:");
        jl1.setBounds(10, 10, 250, 30);
        login=new JButton("login");
        login.setBounds(50,100,100,30);
        jf1=new JTextField("Enter your name");
        jf1.setBounds(15, 40, 250,30);
        jl2=new JLabel(" ");
        jl2.setBounds(20, 20, 250, 30);;*/
        ja1=new JTextArea();
        ja1.setBounds(100, 100, 250, 250);
        ja1.setBackground(Color.CYAN);
        ja1.setForeground(Color.RED);
       
     setSize(300,300);
     setLayout(new FlowLayout());
     setVisible(true);
     setTitle("first jframe.");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     /*add(jl1);
     add(jf1);
     add(jl2);
     add(login);*/
     add(ja1);
     //login.addActionListener(this);
    }
   /* public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==login)
      {
          jl2.setText("LOGIN SUCCESSFULL");
      }
      else
      {
          jl2.setText("LOGIN FAILED");
      }
    }*/


 public static void main(String[] args) 
 {
     new jframe1();
 }   
}
