import java.util.*;

public class Countries {
    public static void main(String[] args) {
        // A Set does not contain duplicates; HashSet has no specific ordering
        HashSet<String> countries = new HashSet<String>();

        System.out.println(countries.add("Indonesia")); // true
        System.out.println(countries.add("Japan"));     // true
        System.out.println(countries.add("Brazil"));    // true
        System.out.println(countries.add("Germany"));   // true
        System.out.println(countries.add("Canada"));    // true
        System.out.println(countries.add("Japan"));     // false (duplicate, not added)

        // size() returns the number of elements in the set
        System.out.println("Number of countries: " + countries.size()); // 5

        // contains() searches the set
        System.out.println("Contains Japan? " + countries.contains("Japan"));
        System.out.println("Contains France? " + countries.contains("France"));
    }
}