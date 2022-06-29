package com.syntax.question217;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MANDATORY {
    /*
    Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
     */
    public static int countDuplicates(List<Integer> numbers) {
        // to count how many numbers are appearing more than once
        int duplicates = 0;
        // create a map to store the keys(number itself) and the value of how many times it appears.
        Map<Integer, Integer> counts = new HashMap<>();
        // loop the list to get each element in the List
        for(int number : numbers){
            // if the Map contains the key (the element of the List) then store the key as that element and the value +1
            // if the key already stores in the Map, then get the key value + 1 ( +1 as appearing one more time)
            if(counts.containsKey(number)){
                counts.put(number, counts.get(number) + 1);
            }else{
                // if the key does not store in the map yet, then store the key and the value is 1 (because it only appears 1 time)
                counts.put(number,1);
            }
        }
        // loop the Map to get how many number are appearing more than once.
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            // if the value of the key is greater than 1, which mean that key is duplicated
            // then the duplicates count +1;
            if(entry.getValue()>1){
                duplicates++;
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(12);
        a.add(13);
        a.add(45);
        a.add(78);
        a.add(7);
        a.add(7);
        System.out.println(countDuplicates(a));

        List<Integer> b = new ArrayList<>();
        b.add(12);
        b.add(12);
        b.add(7);
        b.add(7);
        b.add(7);
        b.add(7);
        b.add(7);
        System.out.println(countDuplicates(b));

        List<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(120);
        c.add(13);
        c.add(45);
        c.add(78);
        c.add(17);
        c.add(57);
        System.out.println(countDuplicates(c));

        List<Integer> d = new ArrayList<>();
        d.add(12);
        d.add(12);
        d.add(13);
        d.add(45);
        d.add(67);
        d.add(87);
        d.add(7);
        System.out.println(countDuplicates(d));


    }


}
