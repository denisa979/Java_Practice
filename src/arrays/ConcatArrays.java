package arrays;

public class ConcatArrays {

    public static void main(String[] args) {
        int[] a1 = {1, 4, 5};
        int[] b2 = {8, 12, 5, 9};
        int[] result = (concatArrays(a1, b2));

        for (int num : result) {
            System.out.println(num + " ");
        }
    }
    public static int[] concatArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            result[index++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[index++] = b[i];
        }

        return result;

    }
}
/*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */