import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            rem = n % i;

            if (rem == 0) {
                System.out.println("Composite");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        }
    }
}
