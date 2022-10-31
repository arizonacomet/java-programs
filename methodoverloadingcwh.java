public class methodoverloadingcwh
{
    static void pr1()
    {
        System.out.println("HEllO WORLD");
    }
    static void pr1(String str)
    {
        System.out.println("GOOD MORNING " + str + " WHAT'S SUP?");
    }
    static void pr1(String st, String st2)
    {
        System.out.println("HOW ARE YOU TODAY " + st);
        System.out.println("HOW ARE YOU TODAY " + st2);
    }
    public static void main(String ar[]) 
    {
     pr1();
     pr1("Mohammed");
     pr1("Mohammed","Janhavi"); //ARGUMENTS ARE ACTUAL

    }
}
