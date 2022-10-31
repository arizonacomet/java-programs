//40) Menu program to change background color of frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class practical40 extends JFrame implements ActionListener
{
JMenu m1,m2;
JMenuItem mb1,mb2,mb3,mb4,mb5,mb6;
JMenuBar mb;
practical40()
{
m1=new JMenu("Colors");
mb1=new JMenuItem("Red");
mb2=new JMenuItem("Blue");
mb3=new JMenuItem("Green");
m2=new JMenu("FY");
mb4=new JMenuItem("WEB DEVELOPMENT");
mb5=new JMenuItem("CORE JAVA");
mb6=new JMenuItem("ANIMATION");
mb=new JMenuBar();

m1.add(mb1);
m1.add(mb2);
m1.add(mb3);
mb.add(m1);

m2.add(mb4);
m2.add(mb5);
m2.add(mb6);
mb.add(m2);
mb1.addActionListener(this);
mb2.addActionListener(this);
mb3.addActionListener(this);
mb4.addActionListener(this);
mb5.addActionListener(this);
mb6.addActionListener(this);
setJMenuBar(mb);
setVisible(true);
setSize(300,300); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
Container c=getContentPane();
if(ae.getSource()==mb1)
{
c.setBackground(Color.RED);
}
else if(ae.getSource()==mb2)
{
c.setBackground(Color.BLUE);
}
else if(ae.getSource()==mb3)
{
c.setBackground(Color.GREEN);
}
else if(ae.getSource()==mb4)
{
JOptionPane.showMessageDialog(this,"You have selected "+mb4.getText(),"",JOptionPane.ERROR_MESSAGE);
}
else if(ae.getSource()==mb5)
{
JOptionPane.showMessageDialog(this,"You have selected "+mb5.getText(),"",JOptionPane.ERROR_MESSAGE);
}
else if(ae.getSource()==mb6)
{
JOptionPane.showMessageDialog(this,"You have selected "+mb6.getText(),"",JOptionPane.ERROR_MESSAGE);
}
}
public static void main(String ar[])
{
new practical40();
}
}
