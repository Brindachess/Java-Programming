import java.util.*;

class Userinput {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        float num = sc.nextFloat();
        int a = sc.nextInt();
        System.out.println (name);
        System.out.println (num);
        System.out.println (a);
    }
}