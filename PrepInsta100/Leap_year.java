import java.util.*;

public class Leap_year {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int rem = year % 4;

        if (rem == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Normal year");
        }
    }
}
