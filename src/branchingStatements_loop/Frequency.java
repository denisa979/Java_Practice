package branchingStatements_loop;

public class Frequency {
    public static void main(String[] args) {

        System.out.println(frequency("aabcccd",'d'));

    }

    public static int frequency(String str, char ch){

        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) ==ch ){
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
