package string;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Denisa";
      String output =  reverseString(str);    // alt+enter=shortcut to create method
      String output1 =  reverseString1(str);  // alt+enter=shortcut to create method
                                              // ctrl + d = shortcut for duplicate
        System.out.println("output = " + output);
        System.out.println("output1 = " + output1);
    }

    private static String reverseString1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str); //StringBuilder is a class where we have reverse String method
       return stringBuilder.reverse().toString();             // To use reverse method we need toString method

    }

    private static String reverseString(String str) {

        String result = "";
        for (int i = str.length()-1; i>=0; i--) {

            result += str.charAt(i);

        }
        return result;
    }

}
