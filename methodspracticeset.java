public class methodspracticeset 
{ 
    static int multiplication(int num) //PROBLEM 1
    {   
        for(int i=1;i<=10;i++)
        {
        System.out.format("%d * %d = %d\n",num,i,num*i);
        }
        return num;
    }
    static void pattern1(int num)  //PROBLEM 2
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
              System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void pattern2(int row)
    {
        for (int i= row-1; i>=0 ; i--)  
        {  
        
        for (int j=0; j<=i; j++)  
        {  
         
        System.out.print("*");  
        }  
        
        System.out.println();  
        }  

    }
 public static void main(String[] args) 
 {
     //multiplication(5); //PROBLEM 1
     //pattern1(5);       //PROBLEM 2
     pattern2(5);
 }   
}
