package arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {
       int [] test=  {3, 5, 1, 5, -1, 7};
        System.out.println(maxNumber(test));

    }

    public static int maxNumber(int [] num){
        int max= num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]>max ){
                max=num[i];
            }

        }
        return max;
    }
}
/*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */