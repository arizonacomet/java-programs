import java.util.Scanner;
public class markstopercentage 
{
 public static void main(String[] args) 
{
 System.out.println("MARKS TO PERCENTAGE CALCULATOR");
 Scanner sc=new Scanner(System.in);
 System.out.print("ENTER THE MARKS FOR PHYSICS:");
 float  p=sc.nextFloat();
 System.out.print("ENTER THE MARKS FOR MATHS:");
 float  m=sc.nextFloat();
 System.out.print("ENTER THE MARKS FOR SCIENCE:");
 float  s=sc.nextFloat();
 System.out.print("ENTER THE MARKS FOR CHEMISTRY:");
 float ch=sc.nextFloat();
 System.out.print("ENTER THE MARKS FOR BIOLOGY:");
 float  bi=sc.nextFloat();
 sc.close();
 float sum=(p+m+s+ch+bi);
 System.out.println(sum);
 float total=500;
 float per=(sum/total)*100;
 System.out.println(per);


}   
}
