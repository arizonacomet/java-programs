//13)Display following pattern
class practical13 
{ int i, j, row=6, s;  

    void pattern1()   
  {   
      System.out.println("PATTERN 1");
    int i, j, row=6;   
    for(i=0; i<row; i++)   
    {   
  
     for(j=0; j<=i; j++)   
    {   
       System.out.print("# ");   
    }   
       System.out.println();   
    }   
  }   
  void pattern2()  
{  
    System.out.println("PATTERN 2");
int rows=3;      
  
for (int i= rows-1; i>=0 ; i--)  
{  

for (int j=0; j<=i; j++)  
{  
 
System.out.print("#" + " ");  
}  

System.out.println();  
}  
}  

void pattern3()
{    System.out.println("PATTERN 3");
    int i, j, row = 3;       
    //Outer loop work for rows  
    for (i=0; i<row; i++)   
    {  
        
    for (j=row-i; j>1; j--)   
    {  
    
    System.out.print(" "); 
    }   
    
    for (j=0; j<=i; j++ )
    {   
     
    System.out.print("* ");
    }   
    System.out.println();   
    }   
    }   

void pattern4()
{
    System.out.println("PATTERN 4");
    for(i=0;i<4;i++)
    {
       for(j=0;j<4;j++)
       {
       if(i%2==0)
        System.out.print("^");
       else
       System.out.print("=");
      
       }
       System.out.println(" ");
    }

}
void pattern5()
{
    System.out.println(" PATTERN 5");
    for(i=4;i>0;i--)
    {
       for(j=0;j<i;j++)
       {if(j%2==0)
           System.out.print("1");
          else
          System.out.print("0");
       }
       System.out.println(" ");
    }

}
void pattern6()
{
    System.out.println("PATTERN 6");
    int i, j, k = 1;
            for (i = 1; i <= 5; i++) 
            {
                for (j = 1; j< i + 1; j++) 
                {
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
}
void pattern7()
{
    System.out.println("PATTERN 7");
    for(i=5;i>1;i--)
    {
       for(j=1;j<i;j++)
       {
           System.out.print("1");
       }
       System.out.println(" ");
   }
   for(i=1;i<5;i++)
   {
      for(j=1;j<=i;j++)
      {
          System.out.print("1");
      }
      System.out.println(" ");
   }


}
       
    public static void main(String ar[]) 
    {
        practical13 p1=new practical13();
        p1.pattern1();
        p1.pattern2();
        p1.pattern3();
        p1.pattern4();
        p1.pattern5();
        p1.pattern6();
        p1.pattern7();

    }

}


