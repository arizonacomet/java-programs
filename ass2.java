import java.util.*;
public class ass2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[][] = new int[3][3];
        int arr[][] = new int[3][3];
        int c[][] = new int[3][3];
   
        System.out.println("Enter the numbers in 1st array: ");
        for (int m = 0; m < array.length; m++) {
            for (int j = 0; j < array.length; j++) {
                array[m][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the numbers in 2nd array: ");
        for (int m = 0; m < array.length; m++) {
            for (int j = 0; j < array.length; j++) {
                arr[m][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication of the matrix is: ");
        for (int m = 0; m < array.length; m++) {
            for (int j = 0; j < array.length; j++) {
                c[m][j] = 0;

                for (int o = 0; o < c.length; o++) {
                    c[m][j]+= array[m][j] * arr[o][j];
                }
                System.out.print(c[m][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
