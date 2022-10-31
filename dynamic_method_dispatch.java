class phone
{
 public void time()
 {
  System.out.println("time is 11:00 pm");
 }
 public void name()
 {
     System.out.println("my name is nokia 1310");
 }
}
class smartphone extends phone
{
 public void music()
 {
     System.out.println("playing night we met");
 }
 public void name()
 {
     System.out.println("my name is samsung m21");
 }

}
public class dynamic_method_dispatch 
{
 public static void main(String[] args) 
 {
     phone ph=new smartphone();
     //smartphone sm=new phone(); Not Allowed
     //ph.music(); Not Allowed
     ph.time();
     ph.name();
     
 }   
}
