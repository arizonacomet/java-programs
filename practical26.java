/* Constructor and  Constructor Overloading
26)Write a Java class Author with following features. 
Instances variables: 
firstName for the author’s first name of type string. 
lastName for the author’s last name of type string. 
Constructor: 
Public Author(String firstName,String lastName):A constructor 
with parameters,it creates the Author object by setting two 
fields to the passed values. 
Instance methods: 
getFirstName():This method returns the first name of the 
author. 
getlastName():This method returns the last name of the author.
*/
import java.util.*;
class practical26
{
    
    
     String afn,aln;
    
     public practical26(String afn, String aln)
     {
         this.afn=afn;
         this.aln=aln;
     }
    public  String getfirstname()
    {
        
        return afn;
       
        
    }
    public  String getlastname()
    {
      
        return aln;
    
    }
    public static void main(String args[])
    {
        
       Scanner sc=new Scanner(System.in);
       
        System.out.println("ENTER AUTHOR'S FIRSTNAME :");
        String afn=sc.next();
        System.out.println("ENTER AUTHOR'S LASTNAME :");
         String aln=sc.next();
         practical26 obj = new practical26(afn,aln);
        System.out.println("AUTHOR'S FIRSTNAME :"+obj.getfirstname());
        System.out.println("AUTHOR'S LASTSTNAME :"+obj.getlastname());
        sc.close();

   

    }
}
