package com.syntax.question220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Format the String: Write the logic to format the string in the below given format xxx-xxx-xxx after each 3 digits ther should be dash("-") if there are any spaces in the input remove those

input ["00-44 48 555555"]

output ["004-448-555-555"]

input ["00-44 48 555"]

output["004-448-555"]

input ["00-44 #$% 48 55"]

output ["004-448-55"]
     */
    public static String formatString(String S) {
        // delete all none number
        String S1 = S.replaceAll("[^0-9]", "");
        // create a array list to hold each number as character and add every dash (-) in every 3 numbers
        ArrayList<Character> arrayList = new ArrayList<>();
        // set count = 1 to count when to add -
        int count = 1;
        // use for loop to go through String S1, add every number as character and every 3 numbers, add -
        for (int i = 0; i < S1.length(); i++) {
            arrayList.add(S1.charAt(i));
            if (count % 3 == 0) {
                arrayList.add('-');
            }
            count++;

        }
//        System.out.println(arrayList);
        // Use StringBuilder to concatenate each character in the array list into one string
        StringBuilder stringBuilder = new StringBuilder();
        // use for loop to go through array list and concatenate it
        for (int i = 0; i < arrayList.size(); i++) {
            // create a character variable to check, if the last value of the array list is ended by -, then do not concate it.
            Character c = arrayList.get(i);
            // if the last c in array list is not - then using .append()
            if (!(c == '-' && i == arrayList.size() - 1)) {
                stringBuilder = stringBuilder.append(arrayList.get(i));
            }
        }
        // convert StringBuilder back to String
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "00-44 48 555555";
        System.out.println(formatString(s));

        String s1 = "00-44 48 555";
        System.out.println(formatString(s1));

        String s2 = "00-44 #$% 48 55";
        System.out.println(formatString(s2));


    }
}
