package branchingStatements_loop;

public class NumbersTasks {

    /*
    Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
     */

    public static void division(int num1, int num2){

        if(num1==0){
            System.out.println("Invalid number");
            return;
        }
        System.out.println(num1+"divided by "+num2+" is");
        int count =0;
        while (num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count+"reminder is "+num1);

    }
    /*
    Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */

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