//11)Write a program in java to enter number from user and check
//whether is prime number or not .Print appropriate message(Enter
//number from user).
import java.util.*;
public class practical11
{
    public static void main(String[] args) 
    {
        int a,i,c=0;
        Scanner sc = new Scanner(System.in);
         System.out.println(" ENTER number");
         a= sc.nextInt();
         sc.close();
         for(i=2;i<a;i++)
         {
              if (a%i==0)
            {
             c++;
             
             }
             
         }
         if(c==0)
         {
         System.out.println("prime");
         }
         else
         {
         System.out.println(" not prime");
         }
        }
   }


