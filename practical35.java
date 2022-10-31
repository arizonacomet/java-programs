/*GUI

35)Convert m to cm.

 */
import javax.swing.*;
import java.awt.*;
import java.awt .event.*;
class practical35 extends JFrame implements ActionListener
    {
         JLabel l1,l2;
         JTextField t1;
         JButton b1;
         practical35()
    {
     l1=new JLabel("ENTER Meter");
     l2=new JLabel(" ");
     t1= new JTextField(10);
     b1 = new JButton("CONVERT");
     add(l1);
     add(t1); add(l2);
     add(b1);
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
        String str =t1.getText();
        int a=Integer.valueOf(str);
        int b=a*100;
        l2.setText("RESULT:"+b);
    }
}
public static void main(String ar[])
{
    new practical35();
}
}

