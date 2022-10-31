/*Abstract class and interface
33)Write a program in java to create abstract class number.
create proper method to accept 2 number. Create abstract
method calculate. Create 2 class add and sub which will perform
addition and subtraction of 2 numbers.
 */
import java.util.*;
abstract class number
{
    int n1,n2,a;
    void accept()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no");
        n1=sc.nextInt();
        System.out.println("enter second no");
        n2=sc.nextInt();
       
        
    }
    abstract void calculate();
}
class add extends number
{
void calculate()
{
    a=n1+n2;
    System.out.println("addition:"+a);

}
}
class sub extends number
{
void calculate()
{
    a=n1-n2;
    System.out.println("subtraction:"+a);

}
}
class practical33
{
    public static void main(String args[])
    {
        add obj =new add();
        obj.accept();
        obj.calculate();
        sub ob =new sub();
        ob.accept();
        ob.calculate();
}
}

