//7)WAP to accept age from user and check whether user is valid for voting or not.If
//user is not valid for voting then also print number of year required to validate.
import java.util.Scanner;
public class practical7 
{
    public static void main(String ar[]) 
    {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE AGE OF THE VOTER :");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE"); 
            System.out.println("YOU HAVE TO BE " + (18-age) + " YEARS OLDER TO VOTE");
            sc.close();
        }
    }
}

