//36)Working with RadioButton
import javax.swing.*;
import java.awt.*;
import java.awt .event.*;
class practical36 extends JFrame implements ActionListener
    {
         JLabel l1,l2;
         JTextField t1;
         JRadioButton rb1,rb2,rb3;
             Font f1, f2,f3;
         
             practical36()
    {
    rb1= new JRadioButton("BOLD");
    rb2= new JRadioButton("ITALICS");
    rb3= new JRadioButton("NORMAL");
     l1=new JLabel("ENTER NAME");
     l2=new JLabel(" ");
     t1= new JTextField(10);
     f1=new Font("Constantia",Font.BOLD,20);
     f2=new Font("Constantia",Font.ITALIC,20);
     f3=new Font("Constantia",Font.PLAIN,20);
     
    ButtonGroup bg= new ButtonGroup();
    bg.add(rb1); 
    bg.add(rb2); 
    bg.add(rb3); 
    
     add(l1);
     add(t1); 
    add(rb1);add(rb2);add(rb3);
    add(l2);
     
     rb1.addActionListener(this);
     rb2.addActionListener(this);
     rb3.addActionListener(this);

    setSize(300,300);
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==rb1)
    {
        String str =t1.getText();
        
        t1.setFont(f1);
}
        else if(ae.getSource()==rb2)
    {
        String str =t1.getText();
        t1.setFont(f2);
        
        
    }
    else
    {
        String str =t1.getText();
        
        
        t1.setFont(f3);
    }
}
public static void main(String ar[])
{
    new practical36();
}
}

