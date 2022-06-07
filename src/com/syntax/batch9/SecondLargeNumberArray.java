package com.syntax.batch9;

public class SecondLargeNumberArray {
    /*
    Given array find second largest number in array
int[]arr={-3000,-2000,-2,-10,-100,-90,-78};
Or it could be positive numbers
int[]arr={3000,2000,2,10,100,90,78};
     */
    public static int secondLargeNumber(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {-3000, -2000, -2, -10, -100, -90, -78};
        int[] arr2 = {3000, 2000, 2, 10, 100, 90, 78};


        System.out.println(secondLargeNumber(arr));
        System.out.println(secondLargeNumber(arr2));
    }
}
