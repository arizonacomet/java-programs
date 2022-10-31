/*Inheritance and Method Overriding
29)Write a program in java to create class number. Create proper
method to accept length and breadth from user. Create another
class area which inherits class number. Create proper method to
calculate area of rectangle.*/
import java.util.*;
class number19
{
    int len,breadth;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        len=sc.nextInt();
        System.out.println("Enter Breadth");
        breadth=sc.nextInt();
        sc.close();
    }
}

class area extends number19
{
    void calc()
    {
        int area=len*breadth;
        System.out.println("Area of Reactangle " +area);
    }
}
    public class practical29
    {
    public static void main(String args[])
    {
        area obj1=new area();
        obj1.accept();
        obj1.calc();
        
    }
}


