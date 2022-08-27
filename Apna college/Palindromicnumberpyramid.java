import java.util.*;

public class Palindromicnumberpyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i =1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                if (i+j<=n+1) {
                    System.out.print(" ");
                }
            }for (int k= i; k>=1; k--) {
                System.out.print(k);
            }
            for (int l=2; l<=i; l++) {
                System.out.print(l);
            }System.out.println("");
        }
    }
}