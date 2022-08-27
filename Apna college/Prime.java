import java.util.*;

public class Prime {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = sc.nextInt();

        for (int i = 2; i<n/2; i++) {
            if (n%i==0) {
                flag = false;
                break;
            } 
        } if (flag) {
            System.out.print ("Prime");
        } else {
            System.out.print ("Composite");
        }
    }
}