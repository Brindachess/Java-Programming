import java.util.*;

public class Invered_half_pyramid_with_Numbers {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i+j<=n+1) {
                    System.out.print(j+ " ");
                }
            }System.out.println("");
        }
    }
}