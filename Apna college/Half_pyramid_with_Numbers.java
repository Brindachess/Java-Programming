import java.util.*;

public class Half_pyramid_with_Numbers {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j <= i)
                System.out.print(j+ " ");
            } System.out.println("");
        }
    }
}