import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mouselistenerEX extends JFrame implements MouseListener
//public class keylistener extends MouseAdapter
{
 JLabel l;
 JTextField area;
 JFrame f1;
 mouselistenerEX()
 {
     f1=new JFrame();
     l=new JLabel();
     l.setBounds(20,50,100,20);
     area=new JTextField(50);
     area.addMouseListener(this);
     f1.add(l);
     f1.setSize(400,400);
     f1.setLayout(null);
     f1.setVisible(true);


 } 
 public void mouseClicked(MouseEvent e)
 {
     l.setText("mouse clicked");

 }
 public void mouseEntered(MouseEvent e)
 {
     l.setText("mouse entered");
 }
 public void mousePressed(MouseEvent e)
 {
     l.setText("mouse pressed");
 }
 public void mouseResleased(MouseEvent e)
 {
     l.setText("mouse released");
 }
  public static void main(String[] args) 
  {
    new mouselistenerEX();  
  }
}