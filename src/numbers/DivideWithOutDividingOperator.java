package numbers;

public class DivideWithOutDividingOperator {

  public static void divide(int num1, int num2) {
      if (num2 == 0) {
          System.out.println("Invalid number");
          return ;
      }

      int count = 0;
      while (num1 >= num2) {
          num1 -= num2;
          count++;
      }
      System.out.println(count + " reminder is " + num1);

  }

    public static void main(String[] args) {
        divide(3,2);
        divide(2,3);
        divide(7,5);
        divide(5,0);
    }
}
//Write a method that can divide two numbers without using division operator.


/*
The loop subtract num2 from num1 as long as num1 is greater than equal to num2. The loop stops when num1 is less than num2. The final value of num1 will be the remainder of the division.

Example:
Initial values: num1=10, num2=3, count=0
First iteration: num1=10-3 =7 count 1
Second iteration: num1=7-3=4 count 2
Third iteration: num1=4-3=1 count 3
The final value of count=3
 */