package branchingStatements_loop;

public class LoginFunction {


    public static void main(String[] args) {

        String username = "Cyde";
        String password = "Cydeo123";

        int attempts = 3;
        boolean loggedIn = false;

        while (attempts > 0 && !loggedIn) {
            loggedIn = login(username,password);
            if (loggedIn) {
                System.out.println("Logged in.");
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect credentials. You have " + attempts + "attempts left.");
                } else {
                    System.out.println("Your account is locked.");
                }
            }
        }
    }

    public static boolean login(String username, String password) {

        String correctUsername = "Cydeo";
        String correctPassword = "Cydeo123";

        return username.equals(correctUsername)&&password.equals(correctPassword);
    }
}



    /*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                 username: Cydeo
                 password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
     */


