package com.syntax.popularJavaInterview;

import java.util.Arrays;

public class MinMaxInArray {
    /*
    For a given array Arr[] containing integer elements, write a code to find the minimum and maximum elements of the array
     */

    public static void main(String[] args) {

        int[] numbs = {10, -23, 345, 12, 45, -123};

        // Option 1:
        Arrays.sort(numbs);
        System.out.println("Minimum number is " + numbs[0]);
        System.out.println("Maximum number is " + numbs[numbs.length - 1]);

        // Option 2:
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int numb : numbs) {
            if (numb > maxNum) {
                maxNum = numb;
            }
            if (numb < minNum) {
                minNum = numb;
            }
        }
        System.out.println("Maximum number is " + maxNum);
        System.out.println("Minimum number is " + minNum);


    }
}
