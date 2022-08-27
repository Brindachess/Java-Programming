import java.util.*;

class Evenodd {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int rem = a%2;

        if (rem == 0) {
            System.out.println("Even");
        }else {System.out.println("Odd");
        }
    }
}