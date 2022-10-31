/*27)Write a program in java to create class with the name programming.
While creating the object of the class if nothing is passed to then
display “I Love Java. If some string (programming language) is
passed then display the name of the string. Perform constructor
overloading. (example if We pass string as PYTHON, then display I
love Python).
*/
class practical27
{
    String str;
    practical27()
    {
        System.out.println("I Love Java");
    }
    practical27(String str)
    {
        System.out.println("I Love "+str);
    }
    public static void main(String args[])
    {
        
        String s="python";
        practical27 obj =new practical27(s);
    }
}

