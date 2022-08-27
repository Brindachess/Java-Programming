import java.util.*;

public class Greatest_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m > n) {
            System.out.println(m);
        } else if (m < n) {
            System.out.println(n);
        }
    }
}
