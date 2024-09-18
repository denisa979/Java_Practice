package branchingStatements_loop;

public class LoginFunction {

    /*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                 username: Cydeo
                 password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
     */

    public static void main(String[] args) { // Used while loop instead of Scanner.
        String userName="Cydeo";
        String password="Cydeo123";

        int attempts = 3;
        boolean loggedIn = false;

        while (attempts > 0 && !loggedIn) {
            loggedIn=login(userName,password);
            if(loggedIn) {
                System.out.println("Logged in");
            }else {
                attempts--;
                if(attempts > 0) {
                    System.out.println("Incorrect credentials. You have "+ attempts + " attempts left.");
            } else {
                    System.out.println("Your account is locked");
                }

            }
        }
    }

    public static boolean login(String username, String password) {
        String correctUserName = "Cydeo";
        String correctPassword = "Cydeo123";

        return username.equals(correctUserName) && password.equals(correctPassword);
    }
}
