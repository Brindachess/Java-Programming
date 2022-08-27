import java.util.*;

public class Strings_cumulative {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String [size];

        int Total = 0;
        for (int i=0; i<size; i++) {
            array[i] = sc.next();
            Total = Total + array[i].length();
        }
        System.out.println(Total);

    }

}