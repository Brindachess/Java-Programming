import java.util.*;

public class Operations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        b = a++;
        System.out.println(b);
        System.out.println(a);
    }

}