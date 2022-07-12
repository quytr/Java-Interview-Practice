package com.syntax.practiceMandatoryAGAIN;

import java.util.Arrays;

public class ArraySumToZero216 {
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

        int[] arr = new int[N];

        if (N == 1) {
            arr = new int[]{0};
        } else {
            for (int i = arr.length - 1; i > 0; i -= 2) {
                arr[i] = i;
                arr[i - 1] = i * -1;
            }
        }

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
