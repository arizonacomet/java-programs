//21)Accept array A  and  B of size 3X3 .Perform Addition of A+B.
import java.util.*;
class practical21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[][]=new int[3][3];
        int y[][]=new int[3][3];
        int z[][]=new int[3][3];
        
        
        
        System.out.println();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
        {
            System.out.println("enter number for array a");
            x[i][j]=sc.nextInt();
           
            

        }
        
    }
    for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.println("enter number for array b");
            
            y[i][j]=sc.nextInt();
            

            
            }
        
    }
    for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
        {
            z[i][j]=x[i][j]+y[i][j];
            System.out.print("sum of the two arrays x and y is : " + z[i][j]);
        }
        System.out.println(" ");

    }
    sc.close();
}
}
