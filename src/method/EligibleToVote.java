package method;

public class EligibleToVote {

    public static void main(String[] args) {
        eligibleToVote(18,false);
    }
    public static void eligibleToVote(int age, boolean isAmerican){

        if(age <= 18 && isAmerican){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }


}
/*
Create a method named eligibleToVote that takes two arguments:
age (int)
isAmerican (boolean)

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