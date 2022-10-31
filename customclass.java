class employee
{
    int id,salary;
    String name;


public void getdeets()
{
    System.out.println("My ID Number is " + id);
    System.out.println("My Name is " + name);
    System.out.println("My Salary is " + salary);

}
}
public class customclass 
{
 public static void main(String[] args) 
 {
     employee mohammed=new employee();
     employee janhavi=new employee();
     mohammed.id=2003;
     mohammed.name="Mohammed";
     mohammed.salary=500000;
     mohammed.getdeets();
     janhavi.id=2005;
     janhavi.name="Janhavi";
     janhavi.salary=10000000;
     janhavi.getdeets();



 }
}