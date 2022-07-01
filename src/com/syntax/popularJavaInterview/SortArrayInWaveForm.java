package com.syntax.popularJavaInterview;

import java.util.Arrays;

public class SortArrayInWaveForm {
    /*
    For a given array of size N containing distinct integer numbers, write a code to sort the array in the wave fashion
     */

    public static void main(String[] args) {

        // This function sorts arr[0..n-1] in wave form, i.e.,
        // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..

        int[] numbs = {2, 34, 35, 65, 1, 64, 7, 0, -43, 435};

        Arrays.sort(numbs);

        int[] newNumbs = new int[numbs.length];

        int temp;

        for (int i = 0; i < numbs.length; i+=2) {
            temp = numbs[i];
            newNumbs[i] = numbs[i+1];
            newNumbs[i+1] = temp;
        }

        System.out.println(Arrays.toString(newNumbs));
    }
}
