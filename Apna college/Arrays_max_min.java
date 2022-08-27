import java.util.*;

public class Arrays_max_min {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            } else if (numbers[i]>max) {
                max = numbers[i];
            }
        }     
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: "+ max);
    }
}