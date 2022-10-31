class parent
{ int x;
    parent()
    {
        System.out.println("i am a constructor in parent class");
    }parent(int x)
    {
        System.out.println("i am a overloaded constructor in parent class with value of x: " +x);
    }
    public int getx()
    {
        return x;
    }
    public void setx(int x1)
    {
        this.x=x1;
    }
}
class child extends parent
{
    int y;
    child() //constructor in inheritance
    {
        //super(88);
        System.out.println("i am a constructor in child class");
    }child(int x,int y) //constructor overloading 
    {  
        super(x);
        System.out.println("i am an overloaded constructor in child class with value of y: " +y);
    }
    public int gety()
    {
        return y;
    }
    public void sety(int y1)
    {
        this.y=y1;
    }
}
class grandchild extends child
    {
        grandchild()
        {
            System.out.println("i am a constructor in grandchild ");
        }
        grandchild(int x, int y,int z)
        {
            super(x,y);
            System.out.println("i am a overloaded constructor in grandchild with value of z: " +z);
        }
        public void gc()
        {
            System.out.println("grandchild ");
        }
        
    }
public class inheritance_with_constructors
{
    public static void main(String[] args) 
    {
     //parent p=new parent();
     //p.setx(69);
     //System.out.println(p.getx());
     //child c=new child(78,59);
     //c.sety(10);
     //System.out.println(c.gety());
     grandchild gc=new grandchild(22,33,44);
     gc.gc();
    }
}