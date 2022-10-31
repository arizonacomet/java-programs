//12)Enter number from user and check number is armstrong number or not.
import java.util.*;
public class practical12
{
    public static void main(String[] args) 
    {
        int a,i,sum=0,b;
        Scanner sc = new Scanner(System.in);
         System.out.println(" ENTER number");
         a= sc.nextInt();
         b=a;
         while(b>0)
         {
             i=b%10;
             sum=sum+(i*i*i);
             b=b/10;
         }
         if(a==sum)
         {
         System.out.println("armstrong");
         }
         else
         {
         System.out.println(" not armstrong");
         }
         sc.close();
    }
}
