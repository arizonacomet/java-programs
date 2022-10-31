/*31)Write a program in java to perform multilevel inheritance. Create
class number which will accept 2 numbers from user. Create another
class CAdd which will have method add that perform addition of 2
number. Create another class CSub which will have method sub that
perform subtraction of 2 number.
Perform multilevel inheritance.*/
import java.util.*;
class number
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
    }
    class Cadd extends  number
    {
        void calculate()
        {
            a=n1+n2;
            System.out.println("additiion:"+a);
        
        }
    }
    class Csub extends  Cadd
    {
        void sub()
        {
            a=n1-n2;
            System.out.println("subtraction:"+a);
        
        }
    }
    
    class practical30
    {

        
    public static void main(String args[])
    {
        
       
        Csub obj =new Csub();
        obj.accept();
        obj.calculate();
        obj.sub();

    }
}

