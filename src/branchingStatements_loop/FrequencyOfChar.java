package branchingStatements_loop;

public class FrequencyOfChar {
    public static void main(String[] args) {

        int frequency = frequencyOfCharacter("Java Programming Language ", 'g');
        System.out.println("frequency = " + frequency);


    }

    public static int frequencyOfCharacter(String str, char ch){

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
        return count;
    }
}


  /*
    Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
    Ex:
    inputs:
    str = "aabcccd";
    char = 'c';

    output: 3

    inputs:
            "Java programming language"
            'g'

    output: 4
            */

