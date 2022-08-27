import java.util.*;

public class Function_factorial {
    public static int Fact(int n) {
        int fact = 1;
        for (int i = n; i>=1; i--) {
            fact = fact * i;
        }
        return fact;
    }
     public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = Fact(n);

        System.out.println(fact);

        int m = sc.nextInt();
        fact = Fact(m);
        System.out.println(fact);
     }

}