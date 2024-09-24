package branchingStatements_loop;

import java.util.function.DoubleToIntFunction;

public class PositiveNegative {
    public static void main(String[] args) {
        int [] input = {10, 20 -1, 0, 3};
        int positiveCount = 0;
        int negativeCount = 0;

        for(int num : input){
            if(num>0){
                positiveCount++;
            }else{
                negativeCount++;
            }
        }
        System.out.println(positiveCount+ " positive " + negativeCount + " negative");
    }
}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
         Ex:
             Inputs:
                 10
                 20-1
                 0
                 3

                Output:
                    3 positive and 1 negative
 */