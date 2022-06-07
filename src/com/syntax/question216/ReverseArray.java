package com.syntax.question216;

public class ReverseArray {
    /*
    For a given array of size N, write a code to print the reverse of the array
    https://www.interviewkickstart.com/interview-questions/java-interview-questions-testers
     */

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = (nums.length - 1); i >= 0; i--) {
            System.out.println(nums[i]);
        }

    }
}
