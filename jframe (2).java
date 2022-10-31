import javax.swing.*;
import java.awt.*;

public class jframe 
{
 static class second extends jframe
 {
     JLabel l1;
     JLabel l2;
     JTextField t1;
     JTextField t2;
     JButton b1;
     second()
     {
         l1 =new JLabel("ENTER USERNAME:");
         t1 =new JTextField(10);  
         l2 =new JLabel("ENTER PASSWORD:");
         t2 =new JTextField(10);
         b1 =new JButton("LOGIN");
       


     }
     public static void main(String[] args) 
     {
       new second();   
     }
     

 }   
}
