import java.util.*;

class Calculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        switch (button) {
            case 1: 
            System.out.println(sum);
            break;
            case 2:
            System.out.println(sub);
            break;
            case 3:
            System.out.println(mul);
            break;
            case 4:
            System.out.println(div);
            break;
            case 5:
            System.out.println(mod);
            break;
        }
    }
}