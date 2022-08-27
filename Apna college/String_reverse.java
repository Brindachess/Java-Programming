import java.util.*;

public class String_reverse {
    public static void main (String args[]) {
        StringBuilder sb = new StringBuilder("Rajorshi");
        System.out.println(sb);

        for (int i=0; i<sb.length()/2; i++) {
            char Front = sb.charAt(i);
            char Back = sb.charAt(sb.length()-1-i);

            sb.setCharAt(i, Back);
            sb.setCharAt((sb.length()-1-i), Front);

        }
        System.out.println(sb);
    }
}