package com.syntax.question229;


import java.util.ArrayList;
import java.util.List;

public class MANDATORY {
    /*
    Count the maximum repetition of a character examples are given below

"abscaaaaabdddd" -> 6

"dddddddddd" -> 10

"daccccdndeeeennnnndddddd" -> 9

"a"->1

""-> 0
     */

    public static int countMaxChar(String str) {

        char[] arrCh = str.toCharArray();    // create a character array to store individual character of given string and convert the string to array.

        int count = 1;           // to count to repetition of a character, the count = 1 because we start from 1 (we count the character itself)
        int maxCount = 0;        // to compare if there are more than 1 different character is repeated.
        int size = arrCh.length; // the size of the array

        // the first for loop will hold the first character and start comparing to the second character and so on the inner loop
        // keep iterating it
        for (int i = 0; i < size; i++) {
            // set j = i + 1 so we dont have to recheck the previous character
            for (int j = i + 1; j < size; j++) {
                // when we find the character is repeated, the count will be increment by 1
                if (arrCh[i] == arrCh[j]) {
                    count++;
                }
            }
            // update the max count, if we find another character is repeated and it has more count than the previous one
            // then max count will be updated
            if (maxCount < count) {
                maxCount = count;
            }
            // the count has to reset back for the next character
            count = 1;

        }
        // the maximum repetition of a character
        return maxCount;

    }

    public static void main(String[] args) {

        String a = "abscaaaaabdddd";
        System.out.println(countMaxChar(a));

        String b = "dddddddddd";
        System.out.println(countMaxChar(b));

        String c = "daccccdndeeeennnnndddddd";
        System.out.println(countMaxChar(c));

        String d = "a";
        System.out.println(countMaxChar(d));

        String e = "";
        System.out.println(countMaxChar(e));
    }
}

