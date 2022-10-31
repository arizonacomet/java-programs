class animal
{
 public void name()
 {
     System.out.println("name of the animal is dog.....");
 }

}
class dog extends animal
{
    public void bark()
    {
        System.out.println("and dog barks...");
    }
}
class puppy extends dog
{
    public void bark()
    {
        System.out.println("puppy also barks...");
    }
    public void child()
    {
        System.out.println("child of dog is called puppy");
    }
}

public class animalinhertitance 
{
 public static void main(String[] args) 
 {
     animal a= new animal();
     a.name();
     dog g= new dog();
     g.bark();
     puppy p=new puppy();
     p.child();
     p.bark();
    

 }   
}
