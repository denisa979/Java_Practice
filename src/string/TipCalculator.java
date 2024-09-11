package string;

import java.util.Locale;

public class TipCalculator {

    public static void main(String[] args) {

        String split="Yes";
        int numberOfPeople=4;
        double checkAmount = 476;
        String serviceQuality="Excellent";



        calculateTip(split, numberOfPeople,  checkAmount, serviceQuality);

    }

    public static void calculateTip(String split, int numberOfPeople, double checkAmount, String serviceQuality){

        double tipPercentage;

        switch(serviceQuality.toLowerCase()){
            case "poor":
                tipPercentage=0.05;
                break;
            case "fair":
                tipPercentage=0.10;
                break;
            case "good":
                tipPercentage=0.15;
                break;
            case "great":
                tipPercentage=0.20;
                break;
            case "excellent":
                tipPercentage=0.25;
                break;
            default:
                tipPercentage=0;
                break;
        }
        double totalTip=checkAmount * tipPercentage;
        double totalToPay=checkAmount + totalTip;

        System.out.println("Number of people entered:"+ numberOfPeople );
        System.out.println("Total amount:$" + totalToPay);
        System.out.println("Tip total:$"+totalTip);

        if(split.equalsIgnoreCase("Yes")){
            double totalPerPerson=totalToPay / numberOfPeople;
            double tipPerPerson = totalTip / numberOfPeople;
            System.out.println("Total per person:$"+totalPerPerson);
            System.out.println("Total tip:$"+ tipPerPerson);
        }


    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.7
 */