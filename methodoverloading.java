 class methodoverloading 
{
 void display()
 {
     System.out.println("This is METHOD OVERLOADING program");
 }
 void display(int a)
 {
    System.out.println("value of a is"+a);  
 }
 void display(int a, int b)
 {
    System.out.println("value of a is"+a+" value of b is"+b);

 }  
 public static void main(String ar[]) 
 {
  methodoverloading m1=new methodoverloading();
  m1.display();
  m1.display(6);
  m1.display(5, 6);   
 } 
}
 