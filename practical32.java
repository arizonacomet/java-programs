//32)Java Program to calculate salary of an Employee using
//Hierarchical Inheritance.
import java.util.*;
class emp
{
    int ei,m;
    String en;
    void getinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE NAME:");
        en=sc.next();
        System.out.println("ENTER EMPLOYEE ID NUMBER:");
        ei=sc.nextInt();
        System.out.println("ENTER MOBILE NO:");
        m=sc.nextInt();
    }
    void display()
    {
        System.out.println(" EMPLOYEE NAME:"+en);
        System.out.println("EMPLOYEE ID NUMBER:"+ei);
        System.out.println("MOBILE NO:"+m);
    }
}
class fulltime extends emp
{
    int sal;
    String dn;
    fulltime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DEPARTMENT NAME:");
        dn=sc.next();
        System.out.println("ENTER SALARY:");
        sal=sc.nextInt();
       
    }
    void display()
    {
        System.out.println("DEPARTMENT NAME:"+dn);
        System.out.println("SALARY::"+sal);
        super.display();
        
    }
}
class partime extends emp
{
    
    int sal;
    String dn;
    
    int n,tsal;
    partime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DEPARTMENT NAME:");
        dn=sc.next();
        
        System.out.println("ENTER NO OF WORKING DAYS:");
        n=sc.nextInt();
        tsal=n*1000;
       
    }
    void display()
    {
        System.out.println("DEPARTMENT NAME:"+dn);
        System.out.println("SALARY::"+tsal);
        super.display();
        
    }
}
class practical32
{
    public static void main(String args[])
    {
        fulltime obj =new fulltime();
       
        obj.getinfo();
        obj.display();
        partime ob= new partime();
        ob.getinfo();
        ob.display();
    }
}
