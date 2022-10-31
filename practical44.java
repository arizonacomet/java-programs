//44)WAP program to show choose colour using JColorChooser
import java.awt.event.*;    
import java.awt.*;    
import javax.swing.*;     
public class practical44 extends JFrame implements ActionListener 
{    
    JButton b;
    JLabel L1;
    practical44()
    {    
             b=new JButton("color");    
             b.addActionListener(this);   
        L1=new JLabel("HELLOO!!!!");
    
            setLayout(new FlowLayout());   
            setSize(400,400);    
            setVisible(true);    
            setDefaultCloseOperation(EXIT_ON_CLOSE);          
              
         add(b); 
         add(L1);
      }    
    public void actionPerformed(ActionEvent e)
     {    
        Color initialcolor=Color.BLUE;    
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);    
        //JFrame.setBackground(color);    
        L1.setForeground(color);
    }    
    public static void main(String[] args)
     {    
        practical44 ch=new practical44();    
            
    }    
}


