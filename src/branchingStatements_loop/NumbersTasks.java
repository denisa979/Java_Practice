package branchingStatements_loop;

import java.util.ArrayList;
import java.util.List;

public class NumbersTasks {
    public static void main(String[] args) {
        division(38,5);
        System.out.println("---------------------------------------");

        int [] input ={10, 3, 55 ,-1, 3};
        int result = calculateSum(input);
        System.out.println("Sum until negative number "+result);
        System.out.println("---------------------------------------");

        int N = 100;
        divisible(N);
    }

    /*
    Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
     */

    public static void division(int num1, int num2){

        if(num2>=num1 ){
            System.out.println("Invalid number");
            return;
        }
        int count =0;
        int reminder = num1;
        while(reminder>=num2){
            reminder-=num2;
            count++;
        }
        System.out.println(num1 + " divided by " +num2 +" = " +count+ " reminder is "+ reminder);

    }
    /*
    Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */
    public static int calculateSum(int[] numbers){
        int sum = 0;
        for (int number : numbers){
            if(number < 0){
                break;
            }
            sum += number;
        }
        return sum;
    }
    /*
Create a class named DivisibleBy and Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
             if the number can be divisible by 3, 5 and 15,
                 then it should only be displayed in DivisibelBy15' section

                if the number can be divisible by 3 but cannot be divisible by 15,
                    then it should only be displayed in DivisibelBy3' section

                if the number can be divisible by 5 but cannot be divisible by 15,
                    then it should only be displayed in DivisibelBy5' section

                EX:
                    input: 100

                    Output:
                         Divisible By 15: 15 30 45 60 75 90

                         Divisible By 5:  5 10 20 25 35 40 50 55 65 70 80 85 95 100

                         Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */

    public static void divisible(int N){
        List<Integer> divisibleBy15 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            if(i % 15 == 0){
                divisibleBy15.add(i);
        } else if (i % 5 == 0) {
                divisibleBy5.add(i);
        }else if (i % 3 == 0){
                divisibleBy3.add(i);
            }
        }
        System.out.println("Divisible by 15 = "+ divisibleBy15);
        System.out.println("Divisible by 5 = " + divisibleBy5);
        System.out.println("Divisible by 3 = " + divisibleBy3);
    }
}

