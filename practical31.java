/*31)Write a program in java to create class Add with one
method getResult with two integer parameters which will perform
addition and display the result. Create another class Multiply
which inherit class Add which contain method getResult with
same parameter, which will perform multiplication of two
numbers. Create another class divide which inherit class Multiply
with same method which will perform division of two integer
numbers. Perform method overriding to calculate and display
addition, division.*/
class ADD
{
    int n1,n2,a;
   
        void getResult(int n1,int n2)
        {
            a=n1+n2;
            System.out.println("additiion:"+a);
        
        }
    }
    class  MULTI extends  ADD
    {
        void getResult(int n1 , int n2)
        {
            super.getResult(5,5);
            a=n1*n2;
            System.out.println("multipilcation:"+a);
        
        }
    }
    class  DIV extends  MULTI
    {
        void getResult(int n1,int n2)
        {
            super.getResult(5,5);
            a=n1/n2;
            System.out.println("division:"+a);
        
        }
    }
     class  SUB extends DIV
    {
        void getResult(int n1,int n2)
        {
            super.getResult(5,5);
            a=n1-n2;
            System.out.println("Subtraction:"+a);
        
        }
    }
    class practical31
    {

        
    public static void main(String args[])
    {
        
       
        SUB obj =new SUB();
        obj.getResult(5,5);
        

    }
}

