import javax.swing.*;
import java.awt.*;



class menuEX extends JFrame 
{
    JMenu m1,m2,mb4;
    JMenuItem mb1,mb2,mb3,mb5,mb6;
    JMenuBar mb;
    menuEX()
    {
        m1=new JMenu("COLOUR");
        m2=new JMenu("City");
        mb1=new JMenuItem("RED");
        mb2=new JMenuItem("BLUE");
        mb3=new JMenuItem("MUMBAI");
        mb4=new JMenu("DELHI");
        mb5=new JMenuItem("A");
        mb6=new JMenuItem("B");
        mb=new JMenuBar();
        m1.add(mb1);
        m1.add(mb2);
        m2.add(mb3);
        m2.add(mb4);
        mb4.add(mb5);
        mb4.add(mb6);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());


    }
    public static void main(String[] args) 
    {
        new menuEX();
    }
}
