import java.util.*;

public class Count {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        do {
            int n = sc.nextInt();   
            if (n>0) {
                pos++;
            }
            else if (n<0) {
                neg++;
            }
            else  {
                zero++;
            } choice = sc.nextInt();    
        } while (choice == 1);
        System.out.println("No. of positives = " + pos);
        System.out.println("No. of negatives = " + neg);
        System.out.println("No. of zeroes = " + zero);
    } 
}