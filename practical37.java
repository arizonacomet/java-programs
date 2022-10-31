//37)WAP in Java to create GUI for selecting movie from drop down box 
//and display director name, actor name, actress name and review (use ComboBox)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class practical37 extends JFrame implements ActionListener
{
JComboBox cb1;
JLabel l1,l2,l3,l4;

practical37()
{ 
                l1=new JLabel("Select Movie");
        l2=new JLabel("");
        l3=new JLabel("");
        l4=new JLabel("");      
        cb1=new JComboBox();    
        cb1.addItem("The Amazing Spider-man");
        cb1.addItem("Now You See Me");
        cb1.addItem("Spider-man No Way Home");
                add(l1);add(cb1);add(l2);add(l3);add(l4);
                cb1.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        setLayout(new GridLayout(7,5));
}
public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cb1)
        {
            String str=(String)cb1.getSelectedItem();
            if(str.equals("The Amazing Spider-man"))
            {
                l2.setText("Director name:Marc Webb");
                                l3.setText("Actor name:Andrew Garfield");
                                l4.setText("Actress name:Emma Stone");
                }
            else if(str.equals("Now You See Me"))
            {
                l2.setText("Director name:Jon M. Chu");
                                l3.setText("Actor name:Jesse Eisenberg");
                               
                                l4.setText("Actress name:Lizzy Caplan");
            }
            else
                        {
                l2.setText("Director name:john Watts");
                                l3.setText("Actor name:Tom Holland");
                                l4.setText("Actress name:Zendaya");
                }
    }
}
    public static void main(String ar[])
    {
        new practical37();
    }   
}



