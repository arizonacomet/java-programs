import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString()
    {
      return /*super.toString()*/ "i am toString()";
    }
    @Override
    public String getMessage()
    {
        return /*super.getMessage()*/ "i am getMesaage()";

    }
}
public class Exception_class 
{
 public static void main(String[] args) 
 {
     int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number: ");
     a=sc.nextInt();
     sc.close();
     if(a<9)
     {
         try
         {
           throw new MyException();
           //throw new ArrayIndexOutOfBoundsException("this is an exception");
           //throw new ArithmeticException("this is an exception");
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
             System.out.println(e.toString());
             e.printStackTrace();
             System.out.println("ITS OVER!!!!");
         }
     }
 }   
}
