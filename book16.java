import java.util.Scanner;

class book16
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
        sc.close();
        
    }
    void showdata()
    {
        System.out.println(" NAME OF book:"+b);
        System.out.println("NAME OF AUTHOR:"+a);
        System.out.println("BOOK PRICE:"+p);
        
    }
    public static void main(String args[])
    {
       book16[] obj = new book16[3];
 
		for(int i=0;i<3;i++)
		{
			
			obj[i]=new book16();
			obj[i].Inputdata();	
		}
		for(int i=0;i<3;i++)
		{
			obj[i].showdata();
		}
    }
}
