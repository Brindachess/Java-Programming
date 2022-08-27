import java.util.*;

public class Positive_Negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else if (n == 0) {
            System.out.println("Zero");
        }
    }
}