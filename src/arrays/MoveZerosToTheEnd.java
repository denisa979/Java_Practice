package arrays;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int [] arr2 = {5, 0, 2, 0, 0, 1, 0, 23};
        System.out.println(Arrays.toString(arr(arr2)));
    }


    public static int[] arr(int[] num){

        int [] result= new int[num.length];
        int index =0;
        for (int i = 0; i < num.length; i++) {
               if (num[i]!=0){
                 result [index++]=num[i];//{5, 0, 2, 0, 0, 1, 0, 23}

               }
            }
        return result;
        }

    }

 /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */

