import java.util.*;

public class Inverted_half_pyramid_180 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //if (m - i +1 <= j) {
                  if (i+j>m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println("");
        }
    }
}