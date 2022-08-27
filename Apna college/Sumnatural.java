import java.util.*;

public class Sumnatural {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "+");
            sum = sum + i;
        }
        System.out.print("= " + sum);
    }
}