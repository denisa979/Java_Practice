package method;

public class EmailDomain_Salary {
    public static void main(String[] args) {
        emailDomain("email");
        System.out.println(emailDomain("email"));
    }

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
