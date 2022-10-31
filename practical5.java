//5)Write a Java program to convert hour to minutes.
import java.util.Scanner;
public class practical5 
{
    public static void main(String ar[]) 
    {
    double hrs;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE HOURS :");
    hrs= sc.nextDouble();
    System.out.println("MINUTES :"+(hrs*60));
    sc.close();
    }
}
