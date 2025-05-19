package string;

public class StringManipulation {

     public static void main(String[] args) {
        String input = "aaaexxxppaffx";
        System.out.println(compressString(input));
    }

    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count); // Append the last character and its count
        return result.toString();
    }


}
