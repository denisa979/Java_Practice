package method;

public class Title {

    public static void main(String[] args) {
        System.out.println("title(\"jAvA\") = " + title("jAvA"));

    }

    public static String title (String title){
      title=title.substring(0,1).toUpperCase()+ title.substring(1).toLowerCase();

      return title;
    }
    /*
    Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

     */
}
