import java.util.*;

public class Function_odd_even {
    /*public static void Check(int n) {
        int check = n%2;
        if (check==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }*/
    public static boolean Check2 (int n) {
        int check = n%2;
        if (check == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Check(n);
        boolean result = Check2(n);
        if (result) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
    }
}   