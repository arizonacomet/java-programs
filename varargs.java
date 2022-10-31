public class varargs 
{
    static String sum(String ...arr)
    {
        String result=" major ";
        for(String a: arr)
        {
            result+=a;
        }
        return result;
    }
     public static void main(String[] args) 
 {
     System.out.println("the sum 10 and 5 is " + sum(" moh","ammed"));
     System.out.println("the sum 20,5,10 is " + sum("  jan","hav","i"));
     System.out.println("the sum 30,5,10,20 is " + sum(" muk","arr","am"));
     System.out.println("the sum 50,5,10,20,30 is " + sum(" mer","cu","ry"));
 }   
}
