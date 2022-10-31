class methodovadd 
{
 void add(int a,int b)
 {
     System.out.println("addition of int is "+(a+b));
 }
 void add(double m,double o)
 {

    System.out.println("addition in double is "+(m+o));
 }
 void add(String s1,String s2)
 {
    System.out.println("addition of strings is"+(s1+s2));
 }
 public static void main(String ar[]) 
 {
   methodovadd m=new methodovadd();
   m.add(10, 10);
   m.add(5.5, 8.9);
   m.add("Hello", "World"); 
 }
}
