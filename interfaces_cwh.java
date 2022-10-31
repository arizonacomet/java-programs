interface car //you can create variables in interfaces 
//you can't modify the variables of interface.
{
    public void accelerate(int increment);
    
    public void reverse(int decrement);
}
interface carlights
{
    public void TurnOn();
    public void TurnOff();
}
class RollsRoyce implements car,carlights
{
    int speed=200;
    public void accelerate(int increment)
    {
      speed = speed+increment;
      System.out.println(speed);
    }
    public void reverse(int decrement)
    {
        speed = speed-decrement;
        System.out.println(speed);
    }
    public void TurnOn()
    {
        System.out.println("turning on the lights");
    }
    public void TurnOff()
    {
        System.out.println("turning off the lights");
    }
}
public class interfaces_cwh 
{
 public static void main(String[] args) 
 {
     RollsRoyce rc=new RollsRoyce();
     rc.accelerate(150);
     rc.reverse(60);
     rc.TurnOn();
     rc.TurnOff();

 }
 
}   

