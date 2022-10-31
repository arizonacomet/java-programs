import java.util.*;
public class factorial18 
{
static class FactorialCons
{
    int n;
    int rem;
    FactorialCons()
    {
        System.out.println("Enter input");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
    }
    int display()
    {
       int i;
        rem=1;
        int z=n;
        for(i=1;i<=z;i++)
        {
                rem=rem*i;
        }
        return rem;
    }
    public static void main(String args[])
    {
        FactorialCons obj=new FactorialCons();
        System.out.println("Factorial is "+obj.display());
    }

}
}
