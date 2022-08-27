import java.util.*;

public class Inverted_half_pyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = m; j <= m; j--) {
                if (j >= i) {
                    System.out.print("*");
                }
            }System.out.println("");
        }
    }
}