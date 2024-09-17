package method;

public class Odd_And_isEven_Practice {

    public static void main(String[] args) {
        System.out.println("isEven(23) = " + isEven(23));
        System.out.println("isOdd(23) = " + isOdd(23));
    }

    public static boolean isOdd(int num){
      return num % 2 !=0;

    }

    public static boolean isEven(int n){
       return n % 2 ==0;
    }

      /*
       Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
     */

     /*
    Create a method named isEven, that can return true if a number is an even number, otherwise returns false
    */
}
