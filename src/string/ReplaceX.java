package string;

import java.util.Locale;

public class ReplaceX {

    public static void main(String[] args) {
        String word="xcodeX";
        if(word.contains("x")){
            word=word.replace('x','a').replace('X','a');
            System.out.println(word);
        }
    }
    /*
     Create a class named ReplaceX, replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

     */
}
