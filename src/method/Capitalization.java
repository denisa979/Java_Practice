package method;

import java.util.Locale;

public class Capitalization {

    public static void main(String[] args) {
        capitalization("cyDeO", "sCHooL");
    }

    public static String capitalization(String firstName, String lastName){

       String formatedFirstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
       String formatedLastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
       String fullName=formatedFirstName + " " + formatedLastName;
        System.out.println("Full Name: " + fullName);
        return fullName;


        

    }
}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
 Ex:
     capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */