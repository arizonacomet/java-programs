//JTABBEDPANE
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practical42 extends JFrame implements ActionListener
{
JTextField t,t1,t2;
JButton b,b1;
JRadioButton rb1,rb2;
JComboBox cb1;
JLabel l1;
practical42()
{
	JTabbedPane tp=new JTabbedPane();
	l1=new JLabel("select");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	t=new JTextField(40);
	t1=new JTextField(40);
	t2=new JTextField(40);
	b=new JButton("Enable");
	b1=new JButton("Add");
	ButtonGroup bg=new ButtonGroup();
	rb1=new JRadioButton("First");
	rb2=new JRadioButton("Second");
	cb1=new JComboBox();
	add(tp);
	bg.add(rb1);
	bg.add(rb2);
	tp.add("First Tab",p1);
	p1.add(t);
	p1.add(b);
	b.addActionListener(this);
	rb1.addActionListener(this);
	rb2.addActionListener(this);
	b1.addActionListener(this);
	tp.add("Second Tab",p2);
	p2.add(rb1);
	p2.add(rb2);
	p2.add(l1);
	tp.add("Third Tab",p3);
	p3.add(t2);
	p3.add(b1);
	p3.add(cb1);
	setSize(300,300);
	setVisible(true);
	setLayout(new FlowLayout());
	p2.setLayout(new FlowLayout());

}
public void actionPerformed(ActionEvent ae)
{
	if (ae.getSource()==b)
	{
		String str=b.getText();
		if(str.equals("Enable"))
		{
		t.setEnabled(true);
		b.setText("Disable");
		}
		else{
		 t.setEnabled(false);
		b.setText("Enable");
		}
	}
	else if(ae.getSource()==rb1)
	{
		l1.setText("You have chosen "+rb1.getText());
		System.out.print("hello");
	}
	else if(ae.getSource()==rb2)
	{
		l1.setText("You have chosen "+rb2.getText());
		System.out.print("hello");
	}
	else //if(ae.getSource()==b1)
	{
		String str=t2.getText();
		cb1.addItem(str);
	}

}
public static void main(String ar[])
{
	new practical42();
}
}