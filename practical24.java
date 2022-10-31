//24)Write a program in java to perform method overloading. 
//Calculate area of triangle, area of rectangle and area of circle.
class practical24
{
     void area(double r)
    {
        System.out.println("AREA OF CIRCLE  IS "+((22.0/7.0)*r*r));
    }
     void area(double b, double h)
    {
        System.out.println("AREA OF TRIANGLE IS  "+(0.5*b*h));
    }
     void area(int l,int b)
    {
        System.out.println("AREA OF RECTANGLE  IS  "+(l*b));
    }
    public static void main(String ar[])
    {
        practical24 obj =new practical24();
        obj.area(2.0);
        obj.area(2.0,4.0);
        obj.area(2,3);
        
}
}


