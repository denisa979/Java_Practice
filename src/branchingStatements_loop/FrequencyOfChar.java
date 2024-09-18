package branchingStatements_loop;

public class FrequencyOfChar {
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
    public static void main(String[] args) {
        String str = "Java programming language";
        char ch ='g';
       int frequency =  getFrequencyOfChar(str,ch);
        System.out.println("frequency = " + frequency);


    }

    public static int getFrequencyOfChar(String str, char ch){

        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == ch){
                count++;

            }
        }
        return count;
    }

}






