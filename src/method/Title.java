package method;

public class Title {


    public class FizzBuzz {

        public static void fizzBuzz(int n) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("fizzbuzz ");
                } else if (i % 3 == 0) {
                    System.out.print("fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("buzz ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            fizzBuzz(12); // Example usage
        }
    }
}