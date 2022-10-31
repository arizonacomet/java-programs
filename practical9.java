//9)WAP in java to count occurence of even number and odd number between the range(accept range start
//and end value from user)
import java.util.*;
public class practical9 
{
    public static void main(String args[])
    {
        int ce=0,co=0;
        int s,e;
        Scanner sc = new Scanner(System.in);
         System.out.println(" ENTER STARTING RANGE");
         s= sc.nextInt();
         System.out.println(" ENTER ENDIING RANGE");
         e= sc.nextInt();
         sc.close();
        
                for (int i=s;i<e;i++)
                {
                if(i%2==0)
                ce++;
                else
                co++;
                }
                System.out.println("NO OF EVEN NUMBERS :"+ce);
                System.out.println("NO OF ODD NUMBERS :"+co);
    }
}


