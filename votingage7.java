import java.util.Scanner;
public class votingage7 
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
            System.out.println("YOU HAVE TO BE"+(18-age)+"YEARS OLDER TO VOTE");
            sc.close();
        }
    }
}