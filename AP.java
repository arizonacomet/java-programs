class AP 
{
 AP(int a)
 {
  System.out.println("a= "+a);
 }   
 void show()
 {
     System.out.println("just a program");
 }
}
class BP extends AP
{
 BP(int a,int b)
 {
     super(a);
    System.out.println("b= "+b);
 }
}
class CP extends BP
{
 CP(int a,int b,int c)
 {
     super(1,2);
    System.out.println("c= "+c);
 }
 public static void main(String[] args) 
 {
     CP c1=new CP(1,2,3);
     c1.show();

 }
}