/* Method Overloading and static method
23)Write a program in java to perform method overloading. 
Create two methods of same name square to calculate square 
of integer and double.*/
class practical23
{
     void square(double r)
    {
        System.out.println(" SQUARE  IS "+(r*r));
    }

    
    void square(int r)
    {
        System.out.println(" SQUARE  IS "+(r*r));
    }
    public static void main(String args[])
    {
        practical23 pr =new practical23();
        pr.square(69.69);
        pr.square(2);
        
}
}
