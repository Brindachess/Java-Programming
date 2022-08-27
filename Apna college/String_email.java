import java.util.*;

public class String_email {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String username = "";

        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i)=='@') {
                username += email.substring(0 , i);
                break; 
            } 
        } 
        System.out.println(username);

    }
}