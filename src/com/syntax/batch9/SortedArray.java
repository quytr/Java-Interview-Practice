package com.syntax.batch9;

import java.util.Arrays;

public class SortedArray {
    /*
    Given 2 sorted arrays, merge the arrays in such that the array is sorted(Can’t use any
inbuild functions)
Int[]arr1={1,3,5,7,9};
Int[]arr2={1,2,3,4,10};
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 4, 10};
        // create a new array with the length of arr1 and arr2
        int[] arr3 = new int[arr1.length + arr2.length];
        // set the arr3 index at 0
        int index = 0;
        // set condition to haft of the arr3 length because we add 2 number at the same time for each loop
        for (int i = 0; i < arr3.length / 2; i++) {
            arr3[index] = arr1[i];
            arr3[index + 1] = arr2[i];
            index += 2;  // index + 2 because we already added 2 numbers
        }
//        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {

                int temp = 0;

                if (arr3[i] > arr3[j]) {
                    temp = arr3[i];     // temporary to hold the bigger number
                    arr3[i] = arr3[j];  // swap to the smaller number for the position on the left
                    arr3[j] = temp;     // swap to the larger number to the right
                }
            }
        }

//        System.out.println(Arrays.toString(arr3));

        // to print out the array in order
        for (int arr : arr3) {
            System.out.print(arr + " ");
        }

    }


}
