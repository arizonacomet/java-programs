import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class metertocenti extends JFrame implements ActionListener
{
 JLabel l1;
 JLabel l2;
 JTextField t1;
 JButton b1;
 metertocenti()
 {
     l1=new JLabel("ENTER THE NUMBER IN METERS TO COVERT INTO CENTIMETERS:");
     l2=new JLabel("");
     t1=new JTextField(10);
     b1=new JButton("CONVERT");
     add (l1);
     add (l2);
     add(t1);
     add (b1);
     b1.addActionListener(this);
     setSize(300,300);
     setVisible(true);
     setLayout(new FlowLayout());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==b1)
    
      {
          String str=t1.getText();
          int a = Integer.valueOf(str);
          l2.setText("after converting meters into centimeters"+(a*100));
      }
    }
    public static void main(String[] args) {
        new metertocenti();
    }
}



 



