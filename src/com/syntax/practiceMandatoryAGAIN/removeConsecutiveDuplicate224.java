package com.syntax.practiceMandatoryAGAIN;

import java.util.ArrayList;

public class removeConsecutiveDuplicate224 {
      /*
    Remove Consecutive duplicates Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
     */

    public static String removeConsecutiveDuplicates(String input) {

        if (input.length() <= 1) {
            return input;
        }
        if(input.charAt(0)==input.charAt(1)){
            return removeConsecutiveDuplicates(input.substring(1));
        }else {
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
        }


    }

    public static void main(String[] args) {
        String a = "aabbcde";
        System.out.println(removeConsecutiveDuplicates(a));


        String b = "aabbcc";
        System.out.println(removeConsecutiveDuplicates(b));

        String c = "aabbcca";
        System.out.println(removeConsecutiveDuplicates(c));

        String d = "aabbccaddda";
        System.out.println(removeConsecutiveDuplicates(d));
    }
}
