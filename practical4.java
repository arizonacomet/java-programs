//4)Write a Java program in java to print the area and perimeter of a
//circle.(use of constant).
import java.util.Scanner;

public class practical4
{
   
     public static void main(String[] args)
      {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter radius: ");
      double radius = sc.nextDouble();
      System.out.println("Perimeter is = " + (2 * radius * Math.PI));
      System.out.println("Area is = " + (Math.PI * radius * radius));
      sc.close();
     }
    }


