public class accessmodifyiers 
{
 public int m=10;
 protected int j=20;
 int d=30;
 private int s=40;
 public void meth()
 {
     System.out.println(m);
     System.out.println(j);
     System.out.println(d);
     System.out.println(s);
 }
 public static void main(String[] args) {
     accessmodifyiers am=new accessmodifyiers();
     //am.meth();
     System.out.println(am.m);
     System.out.println(am.j);
     System.out.println(am.d);
     System.out.println(am.s);

 }

}
