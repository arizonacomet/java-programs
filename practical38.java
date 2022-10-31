/*Menu,List and Combobox Example

38). WAP to perform combo box event add product name in 
combo box (Pen, Ruler etc) add qualities in textbox and onclick 
display total bill.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class practical38 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JComboBox cb1;
    JButton b1,b2;
    JTextField t1;
    practical38()
{
    l1=new JLabel("ENTER QUANTITY");
    l2=new JLabel("");  
    l3=new JLabel("SELECT YOUR PRODUCT");
    t1=new JTextField(10);
    cb1=new JComboBox();
    b1= new JButton("GENERATE BILL");
    b2= new JButton("RESET");
    b1.addActionListener(this);
    b2.addActionListener(this);

    cb1.addItem("Pin");
    cb1.addItem("Pen");
    cb1.addItem("Pencil");
    cb1.addItem("Eraser");

    add(l3);add(cb1);
    add(l1);add(t1);
    add(l2);
    add(b1);add(b2);
    cb1.addActionListener(this);
    
    setSize(300,300);
    setVisible(true);
    setTitle("Product Bill");
    setLayout(new FlowLayout());
}
public void actionPerformed(ActionEvent ae)
{String str="",s="";int p=0;
   
    str=(String)cb1.getSelectedItem();
    
    s=t1.getText();
    p=Integer.valueOf(s);
    
    if(ae.getSource()==b1)
    {
    if(str.equals("Pin"))
    {
        l2.setText("You have selected " + s+str + "GRAND TOTAL"+(p*20));
    }
    else if (str.equals("Pen"))
    {
        l2.setText("You have selected " + s+str + "GRAND TOTAL"+(p*30));
    }
    else if (str.equals("Pencil"))
    {
        l2.setText("You have selected " + s+str + "GRAND TOTAL"+(p*10));
    }
    else
    {
        l2.setText("You have selected " + s+str + "GRAND TOTAL"+(p*5)); 
    }

}
if(ae.getSource()==b2)
    {
    l2.setText("");
    t1.setText("");
    }
    
}

public static void main(String args[])
{
    new practical38();
}
}
