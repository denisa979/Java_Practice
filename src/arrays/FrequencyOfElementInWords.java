package arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElementInWords {


    private static final String[] numberWords = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

     public static void frequencyOfElement(int[] element) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : element) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            if (freq == 1) continue;
            String freqWord = freq > 10 ? "more than 10" : numberWords[freq];
            System.out.println(entry.getKey() + " is " + freqWord);
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1,3,2,2,2,4,10,11};
        frequencyOfElement(arr);
    }
}



/*
        Frequency of Each Element in Words

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array. Output the frequency in a sentence using words to represent the number

        Constraints: a frequency can be any number from 1 to 10. If any frequency goes above 10 output: "more than 10" as the message

        Ex:
            input:
                frequencyElement(1,2,3,4,3,2,1,3,2,2,2,4,10,11)
            output:
                1 is two
                2 is five
                3 is three
                4 is two
     */
