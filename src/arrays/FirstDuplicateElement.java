package arrays;

public class FirstDuplicateElement {

    public static void main(String[] args) {
        int [] arr2= { 5, 1, 5, -1, 5,};
        System.out.println("firstDuplicate(arr2) = " + firstDuplicate(arr2));
    }

    public static int firstDuplicate(int [] arr){

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr [i];
                }
            }
        }
        return 0;
    }


}
/*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */
