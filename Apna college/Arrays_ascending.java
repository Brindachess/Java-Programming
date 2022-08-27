import java.util.*;

public class Arrays_ascending {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        boolean flag=true;

        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i=0; i<size-1; i++) {
            if(numbers[i]>numbers[i+1]) {
               flag=false;
               break;
            } 
        } 
        if (flag) {
            System.out.println("Ascending");
        } else {
            System.out.println("Not Ascending");
        }
    }
}