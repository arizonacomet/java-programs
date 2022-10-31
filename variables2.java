import java.util.*;
class variables2
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int b;
       String name;
       char gender;
       byte age;
       long mobile;
       float percentage;
       double per;
       System.out.println("enter a number:");
       b=sc.nextInt();
       System.out.println("ENTER YOUR NAME :");
       name=sc.next();
       System.out.println("ENTER YOUR GENDER :");
       gender=sc.next().charAt(0);
       System.out.println("ENTER YOUR AGE :");
       age=sc.nextByte();
       System.out.println("ENTER YOUR MOBILE :");
       mobile=sc.nextLong();
       System.out.println("ENTER YOUR PERCENTAGE :");
       percentage=sc.nextFloat();
       System.out.println("ENTER YOUR PERCENTAGE FOR DOUBLE :");
       per=sc.nextDouble();       
       int percent=(int)per;  //for double casting
       sc.close();

       System.out.println(name);
       System.out.println(gender);
       System.out.println(age);
       System.out.println(mobile);
       System.out.println(percentage);
       System.out.println(percent);
       System.out.println(b);

    }
}