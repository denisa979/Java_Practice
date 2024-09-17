package method;

public class Min_And_MaxNum {

    public static void main(String[] args) {
        System.out.println("minNumber(3,2) = " + minNumber(3, 2));
        System.out.println("maxNum(5,7) = " + maxNum(5, 7));
    }

    public static int minNumber(int num1, int num2){

        if(num1 < num2) {
            return num1;
        }else {
            return num2;
        }

        }
        public static int maxNum(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else {
            return n2;
        }
    }



    /*
    Create a method named min, that can return the minimum number between two numbers
     */

     /*
    Create a method named max, that can return the maximum number between two numbers
     */
}
