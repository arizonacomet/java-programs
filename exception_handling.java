import java.util.Scanner;

public class exception_handling 
{
 public static void main(String[] args) 
 {
  int[] arr= new int[5];
  arr[0]=25;   
  arr[1]=35;   
  arr[2]=45;   
  arr[3]=55;   
  arr[4]=65;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a index: " );
  int ind=sc.nextInt();
  System.out.println("enter a number: ");
  int num=sc.nextInt();
  sc.close();
  try
  {
   System.out.println("The value of array index entered is : " +arr[ind]);
   System.out.println("The array value number is " +arr[ind]/num);
  }
  catch(ArithmeticException ae)
  {
      System.out.println("Error: Some Exception occured");
      System.out.println("ERROR: " +ae);
  }
  catch(ArrayIndexOutOfBoundsException ab)
  {
      System.out.println("Error: Some Exception occured");
      System.out.println("ERROR: " +ab);
  }
  catch(Exception e)
  {
      System.out.println("Error: Some Exception occured");
      System.out.println("ERROR: " +e);
  }


 }   
}
