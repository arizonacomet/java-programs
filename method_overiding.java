class baap 
{   public int a;
    public int momo()
    {
        return 6;
    }

    public void method2()
    {
        System.out.println("method 2 of class baap");
    }
}
class beta extends baap
{
    @Override
    public void method2()
    {
        System.out.println("method 2 of class beta");
    }
    public void method3()
    {
        System.out.println("method 3 of class beta");
    }

}

public class method_overiding 
{
 public static void main(String[] args) 
 {
   baap bp=new baap();
   bp.method2();
   beta bt=new beta();
   bt.method2();
 }   
}
