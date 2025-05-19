package arrays;


public class SecondLargestNumberInArray {
    public static void main(String[] args) {
    int[] arr = {3, 4, 5, 1, 2, 6};
    int result = findSecondLargest(arr);
    System.out.println(result); // Output: 5
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
    public static int findSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
          
}

  secondLargest = num;
        }
    return secondLargest;
}
}                 
