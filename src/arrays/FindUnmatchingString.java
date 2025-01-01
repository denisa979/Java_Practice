package arrays;


import java.util.HashSet;
import java.util.Set;

public class FindUnmatchingString {
    
   

    public static String findUncommon(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();


        for (char c : s1.toCharArray()) {
            set1.add(c);
        }


        for (char c : s2.toCharArray()) {
            set2.add(c);
        }


        Set<Character> result = new HashSet<>(set1);
        result.addAll(set2); // Union of both sets
        result.removeAll(set1.stream().filter(set2::contains).toList()); // Remove common elements


        StringBuilder uncommon = new StringBuilder();
        for (char c : result) {
            uncommon.append(c);
        }

        return uncommon.toString();
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdefg";
        System.out.println("Uncommon characters: " + findUncommon(s1, s2));
    }
}



    

