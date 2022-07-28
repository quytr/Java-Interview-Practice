package com.syntax.ali;


public class DistinctList {

    /*
    distinct list
     */
    public  static int DistinctList (int[]arr){

        int count = 0;

        for (int i = arr.length - 1; i > 0; i--) {

            if(arr[i]== arr[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3};
        System.out.println(DistinctList(arr));

        int[] arr2 ={0,-2,-2,5,5,5};
        System.out.println(DistinctList(arr2));

        int[] arr3 ={100,2,101,4};
        System.out.println(DistinctList(arr3));
    }


}
