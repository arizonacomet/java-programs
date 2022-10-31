class cellphone
{
    public void callfriend(int phonenum)
    {
        System.out.println("calling "+phonenum);
    }
    public void pickcall()
    {
        System.out.println("connecting.........");
        System.out.println("call connected!");
    }

}
interface GPS
{
 public void locating();
}
interface camera
{
    public void snaps();
}
interface mediaplayer extends camera //Inhertance in intefaces.
{
    public void playvideo();
}
interface WIFI
{
   public String[] getnetworks();
    public void connecttonetwork(String network);
}
class smartphone extends cellphone implements GPS,mediaplayer
{
    public void callfriend()
    {
    System.out.println("calling shivam..................");
    System.out.println("call connected!");
    System.out.println("starting to trace.......................");
    }
    public void locating()
    {
    System.out.println("tracing his location using cellphone towers............");
    System.out.println("tracing successfull");
    }
    public void snaps()
    {
     System.out.println("gaining access to his camera...................");
     System.out.println("using his camera now to find out his activities!");
    }
    public void playvideo()
    {
     System.out.println("gaining access to his media files........................");
     System.out.println("playing videos now to freak him out!:))");
    }
    public String[] getnetworks()
    {
        System.out.println("getting a list of available networks");
        String[] networklist={"mohammed","bikaner","creations3d"};
        return networklist;
    }
    public void connecttonetwork(String network)
    {
        System.out.println("connecting to....... " +network);
    }


}
public class mobiles 
{
 public static void main(String[] args) 
 {
     smartphone sm=new smartphone();
     sm.callfriend(20316231);
     sm.pickcall();
     sm.locating();
     sm.snaps();
     sm.playvideo();
    String[] ar = sm.getnetworks();
    for(String element:ar)
    {
      System.out.println(element);
    }
    sm.connecttonetwork("mohammed");
    

 }   
}
