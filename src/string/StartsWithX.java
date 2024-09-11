package string;

public class StartsWithX {

    public static void main(String[] args) {

        String word ="xcodex";
        if(word.startsWith("x")){
          word="a" +word.substring(1);
        }
        System.out.println(word);
    }
    /*
    Create a class named StartsWithX and write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

     */
}
