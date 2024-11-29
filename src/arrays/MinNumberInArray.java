package arrays;

public class MinNumberInArray {

    public static void main(String[] args) {
        int[] num = {3, 5, 1, 5, -1, 5};
        System.out.println(minNumber(num));
    }

    public static int minNumber(int [] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
               min = arr[i];
            }
        }
        return min;
    }
}
/*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */
