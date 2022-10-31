public class methods 
{
   /* int logic(int x, int y)
    {
      int z;
      if(x>y)
      {
          z = x+y;
      }

      else
      {
          z=(x+y)*5;
      }
      return z;
    }
 public static void main(String[] args) 
 {
     int a=2;
     int b=1;
     int c;
     methods mo=new methods();
     c= mo.logic(a,b);
     System.out.println(c);
     
 } */  
 int sum( int a, int b)
 {
    return (a+b)*10;
 }
 public static void main(String[] args) 
 {  int sum;
    methods m2 = new methods();
    sum = m2.sum(6, 5);
    System.out.println(sum);
 }
}


