public class logicalop 
{
 public static void main(String[] args) 
 {
  System.out.println("THIS IS FOR AND...........");
  Boolean a = true;
  Boolean b = false;
  Boolean c = true;
  if(a && b && c)
  {
      System.out.println("YES");
  }
  else
  {
      System.out.println("NO");
  }

  System.out.println("THIS IS FOR OR...........");
  Boolean d = true;
  Boolean e = false;
  Boolean f = true;
  if(d || e || f)
  {
      System.out.println("YES");
  }
  else
  {
      System.out.println("NO");
  }
  System.out.println("FOR LOGICAL NOT");
  System.out.println("Not(A) is");
  System.out.println(!a);
  System.out.println("Not(B) is");
  System.out.println(!b);


 }   
}
