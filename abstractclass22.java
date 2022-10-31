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
        sc.close();
        
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
class abstractclass22
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