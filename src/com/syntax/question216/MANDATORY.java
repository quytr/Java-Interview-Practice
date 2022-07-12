package com.syntax.question216;


import java.util.Arrays;

public class MANDATORY {
    /*
    Create an Array of size N whose elements sum to zero

ArraySumToZero(0) ->{}

ArraySumToZero(1) ->{0}

ArraySumToZero(2) ->{-1,1}

ArraySumToZero(3) ->{1,-1,0}

ArraySumToZero(4) ->{2,-2,3,-3}

N will be given as input to the function and fucntion will return an array whose element will sum to zero.
     */
    public static int[] arraySumToZero(int N) {
        // create an array with N as the size.
        int[] arr = new int[N];
        // declare index of that array at the position 0
        int index = 0;
        // declare the value of the element in the array base on N size
        // N/2 first because number has to be smaller than N size
        // second, when we assign the value of the element, we will assign 2 element at the same time
        int number = N / 2;
        // if N size = 1, then the array element {0}
        if (N == 1) {
            return new int[]{0};
        }
        // loop the array to assign the value of each element
        while (number > 0) {
            // at index 0, the first element = number
            arr[index++] = number;
            // at the next index, element = number * -1 (to keep the sum = 0)
            arr[index++] = number * -1;
            // decrement the condition
            number--;
            // if the size of the array is odd number, then the last element will be default as 0.
        }

//        // another way:
//        for (int i = (arr.length-1); i > 0; i--) {
//            arr[i]= (N-1);
//            arr[i-1]= (N-1) * -1;
//            i--;
//            N--;
//
//        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(0)));
        System.out.println(Arrays.toString(arraySumToZero(1)));
        System.out.println(Arrays.toString(arraySumToZero(2)));
        System.out.println(Arrays.toString(arraySumToZero(3)));
        System.out.println(Arrays.toString(arraySumToZero(4)));
        System.out.println(Arrays.toString(arraySumToZero(5)));
        System.out.println(Arrays.toString(arraySumToZero(6)));
        System.out.println(Arrays.toString(arraySumToZero(7)));




    }

}
