package numbers;

public class ReverseNegativeNumber {
}

//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53

/*
If the input number is positive and has only one digit, we return that digit.
If the input number is positive and has more than one digit, we recursively reverse the digits.
For negative numbers, we print the minus sign and then reverse the absolute value of the number.
Note that this code will handle negative numbers correctly, including the case of Integer.MIN_VALUE 1.
solution for reverse number.
 */
