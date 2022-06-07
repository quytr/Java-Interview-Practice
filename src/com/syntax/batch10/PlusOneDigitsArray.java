package com.syntax.batch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOneDigitsArray {
    /*
    You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant to least
significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
     */
    public static int[] plusOne(int[] digits) {

        // checking if the array is empty then return array with 1
        if (digits == null || digits.length == 0) {
            int[] temp = {1};
            return temp;
        }

        int i;
        //using for loop to check the last digit
        for (i = digits.length - 1; i >= 0; i--) {
            // if the last digit is 9, then return as 0 (9+1=10)
            if (digits[i] == 9) {
                digits[i] = 0;
            // if the last digit is not 9, then add 1  then return arr digits on line 63
            } else {
                digits[i] = digits[i] +1;
                break;
            }
        }
        // if i = -1 only when the last digit = 9 because the for loop keep checking until the condition false which mean i =-1
        // only happen when digit is  9, 99, 999,....
        if(i<0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }else{
            return digits;
        }

    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 3, 2, 1};
        int[] a3 = {9, 9};
        int[] a4 ={};
        int[]a5 = null;
        int[]a6 ={2,9,9};

        System.out.println(Arrays.toString(plusOne(a1)));
        System.out.println(Arrays.toString(plusOne(a2)));
        System.out.println(Arrays.toString(plusOne(a3)));
        System.out.println(Arrays.toString(plusOne(a4)));
        System.out.println(Arrays.toString(plusOne(a5)));
        System.out.println(Arrays.toString(plusOne(a6)));


    }
/*
    public static int[] plusOne(int[] digits) {

        if(digits == null || digits.length == 0){
            int[] temp={1};
            return temp;
        }

        int carry=1;
        int i;
        for( i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                carry+=digits[i];
                digits[i]=carry;
                break;
            }
        }
        if(i<0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }else
            return digits;
    }

    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (digits == null || digits.length == 0) {
            int[] temp = {1};
            return temp;
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                carry = carry + digits[i] + 1;
            } else {
                carry += digits[i];
            }
            result.add(0, carry % 10);
            carry /= 10;
        }

        if (carry == 1) {
            result.add(0, 1);
        }
        int resultArray[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

 */


}
