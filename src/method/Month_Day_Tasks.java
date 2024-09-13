package method;

public class Month_Day_Tasks {
    public static void main(String[] args) {
        day(4);
        day(3);
        day(10);
    }
    public static void day(int n){
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }



}

/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
 Ex:
     day(5)

        output:
            Friday
 */
/*
Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
 Ex:
     monthName(6)

        output:
            June
 */
/*
Create a method that can print how many days a month has
 Ex:
     month("jUNe")

        output:
            June has 30 days
 */
