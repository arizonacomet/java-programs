/*34)2)create class student with method getdetails personal details of student.
create interface Result with method GetResult to display grade.
create class Studdetails with method getMarks to accept marks of 3 subjects
class studdetails inherit class student as well as interface to calculate marks and dispaly grade of studs */
import java.util.*;
class student
{
    int ei,m;
    String en;
    void getdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STUDENT NAME:");
        en=sc.next();
        System.out.println("ENTER CLASS:");
        ei=sc.nextInt();
        System.out.println("ENTER ROLL NO:");
        m=sc.nextInt();
    }
}
interface Result
{
   public void getResult();
}
class practical34 extends student implements Result 
{
    int s1,s2,s3;

    void getMarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS FOR SUBJECT 1:");
        s1=sc.nextInt();
        System.out.println("ENTER MARKS FOR SUBJECT 2:");
        s2=sc.nextInt();
        System.out.println("ENTER MARKS FOR SUBJECT 3:");
        s3=sc.nextInt();
    }
    public void getResult()
    {

        if((s1+s2+s3)>200)
        System.out.println("GRADE:A");
        else
        System.out.println("GRADE:B");

    }
    void display()
    {
        System.out.println("STUDENT NAME:"+en);
     
        System.out.println(" CLASS:"+ei);
        
        System.out.println(" ROLL NO:"+m);
       
    }
    public static void main(String args[])
    {
        practical34  obj =new practical34 ();
        obj.getdetails();
        obj.getMarks();
        obj.display();
        obj.getResult();
        
    }

}

