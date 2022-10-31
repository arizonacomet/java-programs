//14)Write a program in java to enter operator from user and perform
//calculation(use switch case)
import java.util.Scanner;
public class practical14 
{
    public static void main(String ar[]) 
    {
     double num1,num2;
     Scanner sc=new Scanner(System.in);
    char ch = 'y';
   while(ch =='y')
     {
     System.out.println("enter the first number : ");
     num1=sc.nextDouble();
     System.out.println("enter the second number : ");
     num2=sc.nextDouble();
     System.out.println("choose and operation");
     System.out.println("1 for addition");
     System.out.println("2 for subtraction");
     System.out.println("3 for multiplication");
     System.out.println("4 for division");
     int c;
     c=sc.nextInt();
     switch(c)
     {
         case 1:
         System.out.println("addition :"+(num1+num2));
         break;
         case 2: 
         System.out.println("subtraction :"+(num1-num2));
         break;
         case 3:
         System.out.println("multiplication :"+(num1*num2));
         break;
         case 4:
         System.out.println("division :"+(num1/num2));
         break;
         default:
         System.out.println("wrong input entered");
   
   
     }
     System.out.println("do you want to continue?");
     ch=sc.next().charAt(0);
   
     }
   
   
   
    }      
}
