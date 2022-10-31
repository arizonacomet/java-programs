//19)binary addition
import java.util.*;
public class practical19
{
public void add()
{
long num1,num2;
int i=0,carry=0;
int sum[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter number 1:");
num1=sc.nextLong();
System.out.println("Enter number 2:");
num2=sc.nextLong();
sc.close();
while(num1!=0 || num2!=0)
{
sum[i++]=(int) ((num1%10 + num2%10 + carry)%2);
carry=(int) ((num1%10 + num2%10 + carry)/2);
num1=num1/10;
num2=num2/10;
}
if(carry!=0)
sum[i++]=carry;
--i;
System.out.print("Addition is: ");
while(i>=0)
System.out.print(sum[i--]);
}
public static void main(String ar[])
{
    practical19 b=new practical19();
b.add();
}
}


