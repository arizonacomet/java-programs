class cylinder
{
    Double height;
    Double radius;

public void setheight(Double h)
{
    height = h;
}
public Double getheight()
{
    return height;
} 
public void setradius(Double r)
{
    radius =r;
}
public Double getradius()
{
    return radius;
} 
}
public class cylinders 
{
 public static void main(String[] args) 
 {
     Double result;
     cylinder c=new cylinder();
     c.setheight(10.50);
    System.out.println("height of the cylinder:"+c.getheight());
     c.setradius(12.25);
     System.out.println("radius of the cylinder: "+c.getradius());
     result= (2*3.14*c.getradius()*c.getheight()+c.getradius());
     System.out.println("Area of cylinder : "+result);
    



 }

public void volume(int i, int j) {
}   
}

