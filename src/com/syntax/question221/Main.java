package com.syntax.question221;

public class Main {
    /*
Find the largest even length word from a String if there are two words with same largest even length return the first one. if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
     */

    public static String findMaxLenEven(String str) {
        // split given String to get only word to array
        String[] strings = str.split(" ");
        // assign maxLenEven word = -1 if the word does not meet the condition
        String maxLenEven = "-1";
        // assign maxLength word  = the smallest number to compare to the actual length of each word in array
        int maxLength = Integer.MIN_VALUE;
        // use for loop to go through array
        for (int i = 0; i < strings.length; i++) {
            // assign the length of each word to check
            int wordLength = strings[i].length();
            // condition: if the length is even and the length is larger than maxLength
            if (wordLength % 2 == 0 && wordLength > maxLength) {
                // then maxLength = that word length
                maxLength = wordLength;
                // if that word is maxlength, then re-assign String maxLenEven
                maxLenEven = strings[i];
            }
        }
        // return the max word length even
        return maxLenEven;

    }

    public static void main(String[] args) {

        String a = "find MaxLen Even";
        System.out.println(findMaxLenEven(a));

        String b = "I am very Good at Java";
        System.out.println(findMaxLenEven(b));

        String c = "I was";
        System.out.println(findMaxLenEven(c));

        String d = "find MaxLen Even Odd Testing";
        System.out.println(findMaxLenEven(d));

        String e = "I";
        System.out.println(findMaxLenEven(e));

    }
}
