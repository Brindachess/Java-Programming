import java.util.*;

public class Function_radius {
    public static double Circumference(int r) {
        double circum = 2*3.14*r;
        return circum;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(Circumference(r));
    }
}