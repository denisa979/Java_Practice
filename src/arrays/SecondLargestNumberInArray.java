package arrays;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {
        /*
        1. create an array named classmates, and store 5 of your classmates' full names
            print the initials of each classmates in separate lines

         */

        String[] classmates = {"Fred Rabin", "Mermina Borovina", "Mihaela Popa", "Canan Dorgo", "Denisa Mutapcic"};

        for (String each : classmates) {
            String[] initials = each.split(" ");
            char firstInitial = initials[0].charAt(0);
            char lastInitial = initials[1].charAt(0);
            System.out.print(firstInitial + "" + lastInitial);
            System.out.println();
        }

       /*
        Second largest Number

        Create a method that finds the second largest number in the given array. The second largest must be different from the largest number.

        Ex:
        Input:
                [3, 4, 5, 1, 2, 6]
        Output:
        5

        */

        int[] num = {3, 4, 5, 1, 2, 6};
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        for (int each : num) {
            if (each > largest) {
                secondL = largest;

                largest = each;           // Update largest
            } else if (each > secondL && each != largest) {
                secondL = each;     // Update second largest
            }
        }

        System.out.println("Second largest number is: " + secondL);

        System.out.println("----------------------------------------------------------");

        /*

            reverse each arr and print them in separate lines
                ex:
                    arr = {java, python, c#}

                output:
                    avaJ
                    nohtyp
                    #c
         */
        String[] classmates1 = {"Fred Rabin", "Mermina Borovina", "Mihaela Popa", "Canan Dorgo", "Denisa Mutapcic"};

        for (String each: classmates1){
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);

            }
            System.out.println(reverse);
        }
    }
}

/*


     */

/*

2.

3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

4. given the following arrays:
                 String [] names = {"Anna", "Nancy", "Sarah"};
                int [] scores = {90, 75, 80};
                char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
                 Ex:
                     Anna's score is 90, and grade is A

6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}


8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */