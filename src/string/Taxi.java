package string;

public class Taxi {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] groups = new int[n];

        for (int i = 0; i < n; i++) {
            groups[i] = Integer.parseInt(args[i + 1]);
        }

        int[] count = new int[5];
        for (int group : groups) {
            count[group]++;
        }

        int taxis = count[4]; // Groups of 4 need separate taxis

        // Pair groups of 3 with groups of 1
        int minThreeOne = Math.min(count[3], count[1]);
        taxis += minThreeOne;
        count[3] -= minThreeOne;
        count[1] -= minThreeOne;

        // Remaining groups of 3 need separate taxis
        taxis += count[3];

        // Pair groups of 2 together
        taxis += count[2] / 2;
        count[2] %= 2;

        // If there's one group of 2 left, try to pair it with up to two groups of 1
        if (count[2] > 0) {
            taxis++;
            count[1] -= Math.min(2, count[1]);
        }

        // Remaining groups of 1 need taxis
        if (count[1] > 0) {
            taxis += (count[1] + 3) / 4;
        }

        System.out.println(taxis);

        System.out.println("------------------------------------------------");


    }



}
