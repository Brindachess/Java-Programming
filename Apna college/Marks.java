import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        int marks;

        do {
            marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is good");
            } else if (89 >= marks && marks >= 60) {
                System.out.println("This is also good");
            } else if (59 >= marks && marks >= 0) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid marks");
            }
            button = sc.nextInt();
        } while (button == 1);
    }
}