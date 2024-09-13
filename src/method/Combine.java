package method;

public class Combine {
    public static void main(String[] args) {
        System.out.println("combine(\"one\",\"eight\") = " + combine("one", "eight"));

    }

    public static String combine (String name1 , String name2  ){

        name1="one";
        name2 ="eight";
        if(name1.charAt(name1.length()-1)==name2.charAt(0)) {

            return name1 + name2.substring(1);
        }else {
            return name1+name2;
        }
    }

    /*
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

     */
}
