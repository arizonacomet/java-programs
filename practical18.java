//18)decimal to binary
import java.util.*;
class practical18
{
    
    public static void main(String args[])
   
    
{
    int a,r;
    String n=" ";
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
    while(a>0)
    {
        r=a%2;
        n=r+" "+n;
        a=a/2;
    }
    System.out.println(n);
    sc.close();

    }
}

