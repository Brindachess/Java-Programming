import java.util.*;

public class String_replacement {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String replace = sc.next();
        String result = "" ;

        for (int i=0; i<replace.length(); i++) {
            if (replace.charAt(i)=='e') {
                result += 'i';
            } else {
                result += replace.charAt(i);
            }

        } System.out.println(result);
    }
}