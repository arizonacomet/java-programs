//RPOBLEM 1
class circle
{
    int radius;
    circle(int r)
    {
        this.radius=r;
        System.out.println("parameterised constructor of circle");
    }
   
    public Double area()
    {
        return Math.PI*this.radius*this.radius;
}
class cylinder extends circle
{
    int height;
    cylinder(int h,int r)
    {
      super(r);
      System.out.println("parameterised constructor for cylinder");
      this.height=h;
    }
     
    
    public Double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
}
public class inhertitancepr 
{
    public static void main(String[] args) 
    {
        circle ci=new circle(12);
        ci.area();
        //cylinders c=new cylinders();
    


        
    }
}

