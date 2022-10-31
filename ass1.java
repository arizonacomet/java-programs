import java.util.Scanner;

public class ass1 
{
    public static void main(String args[]) {
        int m, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        m = sc.nextInt();
        int i = 1;

        while (i <= m / 2) {
            if (m % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == m) {
            System.out.println(m + " is a perfect number.");
        } else {
            System.out.println(m + " is not a perfect number.");
            sc.close();
        }
    }
}   


