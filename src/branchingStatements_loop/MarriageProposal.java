package branchingStatements_loop;

public class MarriageProposal {

    public static void main(String[] args) {
        String propose = "Will you marry me?🫢";
        String[] responses = {"maybe", "yes", "no"};
        int responseIndex =0;

        while (true) {

            String answer = responses[responseIndex++].trim().toLowerCase();

            if (answer.equals("yes")) {
                System.out.println("You sure?! No need time to think about it?!");
                break;
            } else if (answer.equals("no")) {
                System.out.println("Phew!");
                break;
            } else{
                System.out.println("Strongly dedicated to DRY principles!🤐");
                break;
            }
        }
    }
}


/*
Create a class named Marriage proposal and Write a program for the  marriage proposal program Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
if the answer is yes, print "Congrats."
if the answer is no, print "Goodbye"
if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */