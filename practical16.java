//16)society
import java.util.*;
class practical16
{
    int hn;
    int m,i;
    String s,flat;
    
    void Inputdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF SOCIETY:");
        s=sc.next();
        System.out.println("ENTER HOUSE NO.:");
        hn=sc.nextInt();
        System.out.println("ENTER  NO. OF MEMBERS:");
        m=sc.nextInt();
        System.out.println("ENTER INCOME:");
        i=sc.nextInt();
        sc.close();
    }
    public  String allocate_flat()
    {
       if(i >=25000 )
       {
       flat="A Type";
       }
       if(i>=20000 && i<25000)
       {
       flat=" B Type";
       }
       else
       {
       flat=" C Type";
       }
       return flat;
    }
    void showdata()
    {
        System.out.println(" NAME OF SOCIETY:"+s);
        System.out.println("HOUSE NO.:"+hn);
        System.out.println(" NO. OF MEMBERS:"+m);
        System.out.println("INCOME:"+i);
        System.out.println("FLAT TYPE"+flat);
        
    }
    public static void main(String args[])
    {
        practical16 sc=new practical16();
        sc.Inputdata();
        sc.allocate_flat();
        sc.showdata();
    }
}



