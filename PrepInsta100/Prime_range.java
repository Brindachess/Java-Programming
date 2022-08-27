import java.util.Scanner;

import java.util.*;

public class Prime_range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int rem;

        for (int i = m; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                rem = i % j;
                if (rem == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
