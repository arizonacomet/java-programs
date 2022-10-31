class constructor
{
    constructor()
    {
        System.out.println("const called");
    }
    void add1()
    {
        System.out.println("this is userdefined function");
    }
    public static void main(String ar[]) 
    {
     constructor a=new constructor();  
     a.add1();
    }
}
