//class and object
//15)calculate area of Rectangle
import java.util.*;
class practical15
{
    int l;
    int w;
    double a;
    void getRecdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        l=sc.nextInt();
        System.out.println("Enter Width:");
        w=sc.nextInt();
        sc.close();
    }
     
    public double calarea()
    {
        a = l*w;
        return a;
    }
    public static void main(String args[])
    {
        practical15 obj=new  practical15();
        obj.getRecdetails();
        System.out.println("Area :"+obj.calarea());
    }
    
}



