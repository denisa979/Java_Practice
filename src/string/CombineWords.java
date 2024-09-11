package string;

public class CombineWords {

    public static void main(String[] args) {
        String word1 = "one";
        String word2 = "eight";
        if (word1.endsWith("e") && word2.startsWith("e")) {
            word1=word1.substring(0,word1.length()-1);
            System.out.println(word1+word2);
        }



    }
    /*
    Create a class named CombineWords.Then add them together and print.
    But if the last letter of first word and the first letter of the last word is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

     */
}
