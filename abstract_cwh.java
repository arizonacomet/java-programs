 abstract class parent1 
{
    parent1()
    {
     System.out.println("hello world");
    }
    public void sayhello()
    {
        System.out.println("saying hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child1 extends parent1
{
    @Override
    public void greet()
    {
     System.out.println("good morning");
    }
    public void greet2()
    {
     System.out.println("good afternoon");
    }
}


public class abstract_cwh 

{
 public static void main(String[] args) 
 {
     child1 c1=new child1();
     c1.greet();
     c1.greet2();
     
 }   
}
