import java.util.*;

public class Function_average {
    public static int Average(int m, int n, int o) {
        int sum = m+n+o;
        int average = sum/3;
        return average;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();

        System.out.println("Average = "+Average(m,n,o));
    }
}