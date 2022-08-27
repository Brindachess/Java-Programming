import java.util.*;

public class Stringbuilder {
    public static void main (String args[]) {
        /*StringBuilder sb = new StringBuilder ("Sagnika");
        System.out.println(sb);
        sb.setCharAt(0, 'R');
        sb.insert(3,'R');
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);*/

        StringBuilder sb = new StringBuilder("S");
        sb.append("a");
        sb.append("g");
        sb.append("n");
        sb.append("i");
        sb.append("k");
        sb.append("a");

        System.out.println(sb.length());
    }
}