class employeeEx
{
    int salary;
    String name;
 public int getsalary()
 {
   return salary;
 }
 public String getname()
 {
     return name;
 }
 public void setname(String n)
 { 
   name = n;
 }
}
public class Employee1 
{
    public static void main(String[] args) 
    {
     employeeEx ex = new employeeEx();
     ex.salary = 50000;
     ex.getname();
     ex.setname("Janhavi");  
     System.out.println(ex.getsalary());
     System.out.println(ex.getname());
    }
}
