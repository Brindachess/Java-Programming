import java.util.*;

public class Spiral_matrix_arrays {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int [rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Spiral matrix: ");

        int row_Start= 0;
        int row_End=rows-1;
        int col_Start=0;
        int col_End=cols-1;

        while (row_Start<=row_End && col_Start<=col_End) {
            for(int j=col_Start; j<=col_End; j++) {
                System.out.print(numbers[row_Start][j] + " ");
            } 
            row_Start++;

            for (int i=row_Start; i<=row_End; i++) { 
                 System.out.print(numbers[i][col_End] + " ");
            }
            col_End--;

            for (int j=col_End; j>=col_Start; j--) {
                System.out.print(numbers[row_End][j] + " ");
            } 
            row_End--;

            for (int i=row_End; i>=row_Start; i--) {
                System.out.print(numbers[i][col_Start] + " ");
            }
            col_Start++;
        }




    }
}