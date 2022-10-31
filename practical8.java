//8)WAP in java to accept number from user and find divisor for number.
import java.util.Scanner;

public class practical8
{
   
    
    
            public static void findAndPrintDivisors(int n)
            {
                for (int i=1;i<=n;i++)
                    if (n%i==0)
                        System.out.printf("%d ",i);
            }
         
            
            public static void main(String args[])
            {
                Scanner sc= new Scanner(System.in);
                System.out.println("Please enter the number greater than zero:");
                int num= sc.nextInt();
                System.out.println("The divisors of "+num+" are: ");
                findAndPrintDivisors(num);
            }
        
    }