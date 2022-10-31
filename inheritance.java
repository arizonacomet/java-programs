class parent
{
    parent()
    {
        System.out.println("I am a constructor in inheritance");
    }
  int x;
  public int getx()
  {
      return x;
  }
  public void setx(int x1)
  {
      this.x=x1;
  }
class child extends parent
{
    int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y1)
    {
        this.y=y1;
    }

}
}
public class inheritance 
{
public static void main(String[] args)   
   { 
       parent p=new parent();
       p.setx(69);
       System.out.println(p.getx());
       child c=new child();
       c.sety(96);
       System.out.println(c.gety());

   }
}

