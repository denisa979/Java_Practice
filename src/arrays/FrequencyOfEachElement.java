package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

    public static void main(String[] args) {
        for (int dt = 97; dt <= 122; dt++) {
            System.out.println((char) dt);
        }
    }

    public static void frequencyOfWord(String [] element){

        Map<String, Integer> frequencyMap=new HashMap<>();

        for (String elements:element){
            frequencyMap.put(elements, frequencyMap.getOrDefault(elements,0)+1);

        }

    }
}

/*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */