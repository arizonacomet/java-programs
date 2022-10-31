//Array
//20)Accept input as 5 nos. in array and find sum of all elements in array
import java.util.*;
class practical20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        int sum=0;
        System.out.println();
        for(int i=0;i<5;i++)
        {
            System.out.println("enter number");
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
}



