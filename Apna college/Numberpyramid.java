import java.util.*;

public class Numberpyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j =1; j<=m; j++) {
                if (i+j<=n+1){
                    System.out.print(" ");
                }
            }for (int k =1; k<=i; k++) {
                System.out.print(i+ " ");
            }System.out.println("");

        } 
    }
}