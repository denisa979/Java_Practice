package method;

public class MainMethodOverloading {
    
    public static void main(String[] args) {

        System.out.println("We are in String[] args");

    }
    
    public static void main(int args) {

        System.out.println("We are in int args");

    }

    public static void main(String args) {

        System.out.println("We are in String args");

    }
   
}
//Output: We are in String[] args
