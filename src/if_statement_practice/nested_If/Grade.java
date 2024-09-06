package if_statement_practice.nested_If;

public class Grade {

    public static void main(String[] args) {

        char grade = 'C';
        String message = "";

        if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {

            if (grade == 'A') {
                message = "excellent";
            } else if (grade == 'B') {
                message = "Great Job";
            } else if (grade == 'C') {
                message = "Good";
            } else if (grade == 'D') {
                message = "Passed";
            } else if (grade == 'F') {
                message = "Failed";
            } else {
                message = "invalid";
            }

            System.out.println(message);
        }
    }


    /*

    Create a class called Grade, a char variable named grade is given. write a program to print the following messages:'A': excellent 'B': great job 'C': good 'D': passed 'F': failed
         other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */
}
