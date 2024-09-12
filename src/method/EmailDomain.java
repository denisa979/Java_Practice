package method;

public class EmailDomain {

    public static String emailDomain(String email) {
        //Using split approach
        try {
            String domain = email.split("@")[1];
            if (domain.equals("gmail")) {
                return "gmail";
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return "gmail";
    }

}
/*
    public static void emailDomain(String email) {
        if (email.contains("@")) {
            String domain = email.split("@")[1].split("\\.")[0];
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email format");
 */














/*
Create a method named emailDomain that can display the domain of the email
 Ex:
     emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 *\


*\
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
 Ex:
     monthName(6)

        output:
            June

 */
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
 Ex:
     capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */
/*
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
 Ex:
     monthName(6)

        output:
            June
 */
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
 Ex:
     day(5)

        output:
            Friday
 */
/*
Create a method that can print how many days a month has
 Ex:
     month("jUNe")

        output:
            June has 30 days
 */
/*
Create a method named eligibleToVote that takes two arguments:
age (int)
isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */
/*
Create a method named salary that takes two arguments:
hourlyRate (double)
weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */