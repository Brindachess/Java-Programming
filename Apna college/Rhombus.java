import java.util.*;

public class Rhombus {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if (i+j<=n+1) {
                    System.out.print(" ");
                }
            }System.out.println("*****");
        }
    }
}