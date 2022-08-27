import java.util.*;

public class Fibonacci {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        int x = 0;
        int y = 1;
        int n = sc.nextInt();
        int sum;

        System.out.print(x+ " ");
        System.out.print (y+ " ");

        for (int i = 1; i<=n-2; i++) {
            sum = x+y;
            x=y;
            y=sum;

            System.out.print (sum+ " ");
        }
    }
}