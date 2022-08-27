import java.util.*;

public class Function_age {
    public static boolean Age(int n) {
        if (n>18) {
            return true;
        } else{
            return false;
        }
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = Age(n);
        if (result) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}