import java.util.*;

public class Power {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = 1;
       
        for (int i = 0; i<n; i++) {
            result = result*x;
            System.out.println(result);
        }
    }
    
} 