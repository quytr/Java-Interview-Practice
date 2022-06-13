package com.syntax.question224;

public class Main {
    /*
    Remove Consecutive duplicates Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
     */

    public static String removeConsecutiveDuplicates(String input) {
        // if given string length is <= 1 then return its string
        if (input.length() <= 1) {
            return input;
        }
        // if at index = 0 and index = 1, the letters are the same, then return the substring start at 1 (which mean, delete the duplicate at index 0) by calling the method again
        // to continue to check the String after delete the duplicate
        // if index 0 and index 1 are not the same, the return index 0 itself, then continue checking the String at index 1 by calling the method again with starting point at index 1
        // if will repeat until it goes through the whole string
        return input.charAt(0) == input.charAt(1) ? removeConsecutiveDuplicates(input.substring(1)) : input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));

        /*
        //Full version:
        if(input.charAt(0)==input.charAt(1)){
            return removeConsecutiveDuplicates(input.substring(1));
        }else{
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
        }

         */

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
