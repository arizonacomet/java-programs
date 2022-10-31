//for, while & nested loop
//10)Accept number from user and print Multiplication table (use while
//loop)
import java.util.*;
public class practical10
{
    public static void main(String[] args) 
    {
        int a,i=1;
        Scanner sc = new Scanner(System.in);
         System.out.println(" ENTER number");
         a= sc.nextInt();
         sc.close();
         while(i<=10)
         {
            System.out.println(a +"x"+i+"="+a*i);
            i++;

         }
        }
    }


