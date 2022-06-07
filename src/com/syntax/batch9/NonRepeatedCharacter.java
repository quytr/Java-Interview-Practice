package com.syntax.batch9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    /*
    Print third non-repeated character in a string
    Input: String str = "The weather today is beautiful";
    Output: ‘o’;

     */

    public static void main(String[] args) {
        String str = "The weather today is beautiful";
        String str2 = str.toLowerCase().replace(" ", "");
        System.out.println(str2);

        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (counts.containsKey(c)) {
                //counts.get(c) to get the value
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        System.out.println(counts);

        ArrayList<Character> arrayList = new ArrayList<>();
        // to get the key and value of the map
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                arrayList.add(entry.getKey());
            }
        }
        System.out.println(arrayList);
        // index start at 0, the third character will be on index 2
        System.out.println("The third non-repeated character in a string is " + arrayList.get(2));


    }
}
