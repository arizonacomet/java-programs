/*28))Write a program in java to create parametrized constructor fact.
Create method display which will return value as factorial of number
an display the same.
*/
import java.util.*;
class practical28
{
    int num=5,fact=1;
    practical28 (int num)
    {
        this.num=num;
    }
    int display()
    {
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String ar[])
    {
        practical28 f=new practical28(5);
        System.out.println("The Factorial of "+f.num+" is "+f.display());
    }
}