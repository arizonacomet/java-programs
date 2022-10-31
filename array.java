public class array 
{
 public static void main(String[] args) 
 {
  int marks[]=new int[5]; //declaration and memory alloacation
  //other ways to create an array
  // int[] marks; //declaration memory alloacation and then initialization
  //marks = new int[5]; //declare and initialization
  //int marks[]={54,60,81,97,88};

  marks[0]=100;  
  marks[1]=58;  
  marks[2]=70;  
  marks[3]=56;  
  marks[4]=96;
  System.out.println(marks[4]);  
  System.out.println(marks.length);
 /* for(int i=0;i>marks.length;i++) //array traverse //for loop
  //for( int i=marks.length-1;i>=0;i--) for array in reverse
  {
      System.out.println(marks[i]);
  }*/
  for(int element: marks) //for each loop
  {
      System.out.println(element);
  }
  //multidimensional array
  int marks1[][]=new int[2][2];

  marks1[0][0]=100;  
  marks1[0][1]=58;  
  marks1[1][0]=70;  
  marks1[1][1]=56;  
  System.out.println(marks1[1][0]);  
  System.out.println(marks1.length);
  
 }   
}
