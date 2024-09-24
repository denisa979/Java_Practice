package numbers;

public class PrimeNumber {

    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]test={2,3,4,5,6,15,16,17,18};
        for (int num : test){
            System.out.println(num+ " is prime: "+prime(num));

        }
    }
}




//Write a method that can check if a number is prime or not

// Prime numbers are divisible by 1 or itself.
//Math.sqrt()--> static method returns square root of a number