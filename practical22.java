 //22)Design a java class to Sort Data (1 D array)that contains the method asec()
//and desc().
import java.util.*;
class practical22
{
    void ascend(int x[])
    { 
        int temp=0;
        for (int i = 0; i < 5; i++)
         {     
            for (int j = 0; j < 5; j++)
             {     
               if(x[i] > x[j]) 
               {    
                   temp = x[i];    
                   x[i] = x[j];    
                   x[j] = temp;    
               }     
            }    
        }
        System.out.println("ascending order");
            for (int i = 0; i < 5; i++) 

        { 
          System.out.println(x[i]);
        }
        } 

    void descend(int x[])
    { 
        int temp=0;
        for (int i = 0; i < 5; i++) 
        {     
            for (int j = 0; j < 5; j++) 
            {     
               if(x[i] < x[j]) 
               {    
                   temp = x[i];    
                   x[i] = x[j];    
                   x[j] = temp;    
               }     
           }
         }
          System.out.println("descending order");
          for (int i = 0; i < 5; i++) 
        { 
          System.out.println(x[i]);
        }
    
               
    }
    
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
            
        }
        practical22 pr = new practical22();
        pr.ascend(x);
        pr.descend(x);
        sc.close();
    }
    

}


