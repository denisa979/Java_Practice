package branchingStatements_loop;

public class UniqueCharacters {

    public static void main(String[] args) {
       System.out.println( findUnique("AABCCD") );
    }
    public static String findUnique(String str){
        String unique ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch;
            }
        }
        return unique;

    }

}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

                Ex:
                    input:
                        AABCCD

                    output:
                        BD
 */