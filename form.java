import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2;
    JRadioButton jr1,jr2,jr3;
    JCheckBox jc1,jc2,jc3,jc4;
    JComboBox jb1;
    JButton b1,b2;
    form()
    {
        l1=new JLabel("Enter Your Name : ");
        l1.setBounds(20,50,100,20);
        t1=new JTextField(20);
        t1.setBounds(20,50,100,20);
        l2=new JLabel("Enter Your Mobile Number : ");
        l2.setBounds(20,100,100,20);
        t2=new JTextField(20);
        l3=new JLabel("Select Your Gender : ");
        jr1=new JRadioButton("MAlE");
        jr2=new JRadioButton("FEMALE");
        jr3=new JRadioButton("OTHERS");
        l4=new JLabel("Select Your Language : ");
        jc1=new JCheckBox("ENGLISH");
        jc2=new JCheckBox("HINDI");
        jc3=new JCheckBox("MARATHI");
        jc4=new JCheckBox("OTHER");
        l5=new JLabel("Please Select Your Qualifications : ");
        jb1=new JComboBox();
        b1=new JButton("SUBMIT");
        b2=new JButton("RESET");
        jb1.addItem("UNDER-GRADUATE");
        jb1.addItem("POST-GRADUATE");
        jb1.addItem("Phd");
        l6=new JLabel(" ");
        Container c =getContentPane();
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(l3);
        c.add(jr1);
        c.add(jr2);
        c.add(jr3);
        c.add(l4);
        c.add(jc1);
        c.add(jc2);
        c.add(jc3);
        c.add(jc4);
        c.add(l5);
        c.add(b1);
        c.add(b2);
        c.add(jb1);
        c.add(l6);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        jb1.addActionListener(this);
        setTitle("STUDENT REGISTRATION FORM");
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(b1);
        this.add(b2);
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==b1)
     {
      l6.setText("Your Form Is Submited.");
     }
     else if(ae.getSource()==b2)
     {
       this.removeAll();
     }
    }
    public static void main(String[] args) 
    {
      new form();  
    }
    
}