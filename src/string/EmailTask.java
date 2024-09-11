package string;

import java.util.Locale;

public class EmailTask {

    public static void main(String[] args) {

        String firstName1 = "mike@gmail";
        String lastName1 = "tyson_";
        String email1;

        email1 = firstName1.replace(firstName1, lastName1);
        System.out.println(email1 + firstName1);

        System.out.println("---------------------------------------");


        String email="craig_federighi@apple.com";
        String fistName=email.substring(0,5);
        String lastName=email.substring(6,15);
        String domain=email.substring(16,21);

        fistName = fistName.substring(0,1).toUpperCase()+fistName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("First name: "+ fistName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("domain:  "+ domain);
    }
}

/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */

/*
 Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */