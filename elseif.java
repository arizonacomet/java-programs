import java.util.Scanner;

public class elseif 
{
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   int age;
   System.out.println("Enter your age:");
   age=sc.nextInt();
   switch(age)
   {
       case 18:
       System.out.println("you are an adult");
       break;
       case 23:
       System.out.println("go get a job ");
       break;
       case 68:
       System.out.println("you are going into retirement");
       break;
       default:
       System.out.println("Enjoy your life!!!");
   }
   /*if(age>56)
   {
       System.out.println("You are Expert");
   }   
   else if(age>46)
   {
       System.out.println("You are Good");
   }
   else if(age>36)
   {
       System.out.println("You are okay");
   }
   else
   {
       System.out.println("You are Noob");
   }*/
   sc.close();
 }   
}
