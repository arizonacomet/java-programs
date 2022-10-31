import java.util.Scanner;

class emp21 
{ Scanner sc=new Scanner(System.in);
    String empid;
    String empname;
    long number;
    String deptname;
    Double salary;
    int noofdays;
    double ptsalary;

    void getinfo()
    {
        System.out.println("Enter the name of the id:");
        empid=sc.next();
        System.out.println("Enter the name of the employee:");
        empname=sc.next();
        System.out.println("Enter the mobile number of the employee:");
        number=sc.nextLong();
    }
        void display()
        {
            System.out.println("id of the employee:"+empid);
            System.out.println("name of the employee:"+empname);
            System.out.println("mobile number:"+number);
        }
    }
    class fulltime extends emp21
    {
        fulltime()
        {
            System.out.println("Enter the department name");
            deptname=sc.next();
            System.out.println("Enter the salary of the employee:");
            salary=sc.nextDouble();

        }
        void display()
        {
            super.display();
            System.out.println("employee department:"+deptname);
            System.out.println("salary of the employee:"+salary);

        }
    }
    class parttime extends emp21
    {
      parttime()
      {
          System.out.println("Enter the number of days:");
          noofdays=sc.nextInt();
          ptsalary=noofdays*1000;

      }  
      void display()
      { 
          System.out.println("number of days worked:"+ noofdays);
          System.out.println("salary of the employee:"+ptsalary);

      }
    }
    class mainemp21
    {
        public static void main(String args[]) 
        {
         fulltime f=new fulltime();
         f.getinfo();
         f.display();
         parttime p=new parttime();
         p.getinfo();
         p.display();   
        }
    }
 

