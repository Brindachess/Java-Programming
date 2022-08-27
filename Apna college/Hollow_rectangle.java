import java.util.*;

public class Hollow_rectangle {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("R"); 
                }
                /*else if (i == n) {
                    System.out.print("R");
                }
                else if (j == 1) {
                    System.out.print("R");
                }
                else if (j == m) {
                    System.out.print("R");
                }*/
                else {
                    System.out.print(" ");
                }
                
            } System.out.println("");
        }
    }
}