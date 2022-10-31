import java.util.*;
class Account1
{
	int a;
	int b;
	void setData()
	{
		Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Id : ");
            a = sc.nextInt();

            System.out.print("\n\tEnter Employee salary : ");
            b = sc.nextInt();
			sc.close();
	}
	 void showData()
	{
		System.out.println("Emp ID ="+a);
		System.out.println("Emp Sal ="+b);
	}
}
class JavaObjectArray1
{
	public static void main(String args[])
    {

    
 

		
		Account1[] obj = new Account1[4];
   {

		for(int i=0;i<4;i++)
		{
			//obj0=new Account1();
			obj[i]=new Account1();
			obj[i].setData();
			//obj0.setData();
		}
		for(int i=0;i<4;i++)
		{
			obj[i].showData();
		}
    }
}
}

 

