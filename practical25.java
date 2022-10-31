//25)Write a program in java to create static method to find 
//maximum between two numbers.
import java.util.*;
class practical25
{
    public void max(int a,int b)
    {
        if(a>b)
        System.out.println("max is "+a);
        else
        System.out.println("max is "+b);

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        practical25 m = new practical25();
        m.max(a,b);

        sc.close();
    }
}

