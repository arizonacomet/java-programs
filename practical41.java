//41)JTREE. 

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.awt.event.*;
import javax.swing.tree.DefaultMutableTreeNode;

class practical41 extends MouseAdapter
{
JFrame f;
JTextField jtf;
JTree jt;
practical41()
{
DefaultMutableTreeNode s= new DefaultMutableTreeNode("STYLE");
DefaultMutableTreeNode c= new DefaultMutableTreeNode("COLOR");
DefaultMutableTreeNode r= new DefaultMutableTreeNode("RED");
DefaultMutableTreeNode b= new DefaultMutableTreeNode("BLUE");
DefaultMutableTreeNode blk= new DefaultMutableTreeNode("BLACK");
DefaultMutableTreeNode wht= new DefaultMutableTreeNode("WHITE");
DefaultMutableTreeNode y= new DefaultMutableTreeNode("YELLOW");
DefaultMutableTreeNode f1= new DefaultMutableTreeNode("FONT");
DefaultMutableTreeNode com= new DefaultMutableTreeNode("Comic Sans");
DefaultMutableTreeNode ar= new DefaultMutableTreeNode("Arial");
s.add(c);
s.add(f1);
c.add(r); c.add(b); c.add(blk); c.add(wht); c.add(y);
f1.add(com); f1.add(ar);
jtf=new JTextField(30);
jt = new JTree(s);
f=new JFrame();
jt.addMouseListener(this);
f.add(jt);
f.add(jtf);
f.add(new JScrollPane(jt));
f.setSize(300,300);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.setTitle("JTREE");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void mouseClicked(MouseEvent me)
{
doMouseClicked(me);
}
public void doMouseClicked(MouseEvent me)
{
TreePath tp = jt.getPathForLocation(me.getX(),me.getY());
if(tp!=null)
{
jtf.setText(tp.toString());
}
else 
{
jtf.setText("");
}
}
public static void main(String ar[])
{
new practical41();
}
}
