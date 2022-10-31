import java.util.Random;
import java.util.*;
class Game
{
    public int number;
    public int noofguesses=0;
    public int inputnum;

    public int getnoofguesses()
    {
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses)
    {
      this.noofguesses=noofguesses;
    }
    Game() 
    {
        Random ran = new Random();
        this.number = ran.nextInt(10);
        
    }
    void takeuserinput()
    {
        System.out.println("Guess the number:");
        Scanner sc=new Scanner(System.in);
        inputnum=sc.nextInt();
        sc.close();
        
    }
    Boolean iscorrectnumber()
    {
        noofguesses++;
        if(inputnum==number)
        {
            System.out.format("yess you have guessed it correct it was   "+number+"   you have guessed it in attempts   "+noofguesses);
            return true;
        }
        else if(inputnum<number)
        {
            System.out.println("too low");
            
            
        }
        else if(inputnum>number)
        {
            System.out.println("too high");
        }
        return false;

    }
}

public class guess_the_number 
{
 public static void main(String[] args) 
 {
    Boolean b= false;
     Game g =new Game();
     while(!b)
     {
     g.takeuserinput();
     b=g.iscorrectnumber();
     
     
    }   
}
}
