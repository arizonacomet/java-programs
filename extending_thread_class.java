import java.util.*;
class MyThread extends Thread
{
    @Override
    public void run()
    {
        int i=0;
     while(i<40000)
     {
         System.out.println("first thread is running");
         System.out.println("this is the first thread");
     i++;
    }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int j=0;
        while(j<40000)
        {
            System.out.println("second thread is running");
            System.out.println("this is the second thread");
        }
        j++;
    }
}
class MyThread3 extends Thread
{
 public void game()
 {
     Scanner sc=new Scanner(System.in);
     int m=10;
     System.out.println("Enter a number to guess the number:");
    int j=sc.nextInt();
     if(m==j)
     {
         System.out.println("congrats you guessed it correct");
     }
     else
     {
         System.out.println("sorry you guessed it wrong");
     }
     sc.close();

 }
}
public class extending_thread_class  //CREATING A THREAD BY EXTENDING A THREAD CLASS.
{
 public static void main(String[] args) 
 {
   MyThread t=new MyThread();
   MyThread2 t2=new MyThread2();
   MyThread3 t3=new MyThread3();
   t.start();
   t2.start();  
   t3.start();
 }   
}
