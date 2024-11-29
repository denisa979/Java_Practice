package if_statement_practice.switch_statement;

import java.util.Locale;

public class Browser {
    public static void main(String[] args) {

       String browser="Safari";
       String result;

       switch (browser.toLowerCase()){
           case "chrome":
               result = "Chrome is selected";
               break;
           case "firefox":
               result = "Firefox is selected";
               break;
           case "opera":
               result = "Opera is selected";
               break;
           case "safari":
               result = "Safari is selected";
               break;
           case "edge":
               result = "Edge is selected";
               break;
           default:
               result = "Invalid Browser";
               break;

       }
        System.out.println(result);
    }

}
/*
write a program that can display the selected browser3.1  declare a String variable called browserName3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        Note: MUST use switch statement
 */