import java.util.Scanner;
public class areaandperimeterofcircle4 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER RADIUS OF CIRCLE: ");
  double radius = sc.nextDouble();
  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
  System.out.println("Area is = " + (Math.PI * radius * radius));
  sc.close();
 }
}