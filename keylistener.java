import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class keylistener extends JFrame implements KeyListener
//public class keylistener extends KeyAdapter
{
 JLabel l;
 JTextField area;
 JFrame f1;
 keylistener()
 {
     f1=new JFrame();
     l=new JLabel();
     l.setBounds(20,50,100,20);
     area=new JTextField(50);
     area.addKeyListener(this);
     f1.add(l);
     f1.setSize(400,400);
     f1.setLayout(null);
     f1.setVisible(true);


 } 
 public void keyPressed(KeyEvent e)
 {
     l.setText("key pressed");

 }
 public void keytyped(KeyEvent e)
 {
     l.setText("key typed");
 }
 public void keyReleased(KeyEvent e)
 {
     l.setText("key released");
 }
  public static void main(String[] args) 
  {
    new keylistener();  
  }
}