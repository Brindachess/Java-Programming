import java.util.*;

public class Strings {
    public static void main (String args[]) {
        /*String firstName = "Sagnika";
        String lastName = "Bhattacharya";
        String fullName = (firstName + " " + lastName);
        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }*/
        
        /*String name1 = "Sagnika";
        String name2 = "Sagnika";
        
        if(name1.compareTo(name2)==0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }*/

        String sentence = "My name is Sagnika";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);

        
    }
}