//17)book object as array
import java.util.*;
class practical17
{
    int p;
    
    String a,b;
    
    void Inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF book:");
        b=sc.next();
        System.out.println("ENTER NAME OF AUTHOR:");
        a=sc.next();
        System.out.println("ENTER BOOK PRICE:");
        p=sc.nextInt();
     
        
    }
    void showdata()
    {
        System.out.println(" NAME OF book:"+b);
        System.out.println("NAME OF AUTHOR:"+a);
        System.out.println("BOOK PRICE:"+p);
        
    }
    public static void main(String args[])
    {
        practical17[] obj = new practical17[3];
   

        for(int i=0;i<3;i++)
        {
            
            obj[i]=new practical17();
            obj[i].Inputdata();
            
        }
        for(int i=0;i<3;i++)
        {
            obj[i].showdata();
        }
    }
}
