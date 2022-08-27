import java.util.*;

public class Table {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 0;

        for (int i = 0; i <= n; i++) {
            System.out.print(n + "*" + i + "=");
            mul = n * i;
            System.out.println(mul);
        }
        
    }
}