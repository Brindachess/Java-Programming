import java.util.*;

public class Greatest_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();

        if (m > n && m > o) {
            System.out.println("Greatest no: " + m);
        } else if (n > m && n > o) {
            System.out.println("Greatest no: " + n);
        } else if (o > m && o > n) {
            System.out.println("Greatest no: " + o);
        }

    }
}
