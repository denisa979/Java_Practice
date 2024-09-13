package method;

public class Month_Day_Tasks {
    public static void main(String[] args) {
        day(4);
        day(3);
        day(10);

        System.out.println("----------------------------------------------------------");

        System.out.println(month(2));
        System.out.println(month(7));

        System.out.println("----------------------------------------------------------");

        daysInMonth("JuNe");
        daysInMonth("AuGust");
        daysInMonth("Ooctober");

        System.out.println("-----------------------------------------------------------");


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
    public static String month( int monthName) {
        switch (monthName) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
               return  "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    public static String daysInMonth(String month) {

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January has 31 days");
                break;
            case "february":
                System.out.println("February has 28 days");
                break;
            case "march":
                System.out.println("March as 31 days");
                break;
            case "april":
                System.out.println("April has 30 days");
                break;
            case "may":
                System.out.println("May has 31 days");
                break;
            case "june":
                System.out.println("June has 30 days");
                break;
            case "july":
                System.out.println("July has 31 days");
                break;
            case "august":
                System.out.println("August has 31");
                break;
            case "september":
                System.out.println("September has 30 days");
                break;
            case "october":
                System.out.println("October has 31 days");
                break;
            case "november":
                System.out.println("November has 30 days");
                break;
            case "december":
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        return month;
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
