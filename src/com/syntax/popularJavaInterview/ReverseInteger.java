package com.syntax.popularJavaInterview;

public class ReverseInteger {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range

    Input: x = 123
    Output: 321

    Input: x = -123
    Output: -321

    Input: x = 120
    Output: 21
     */

    public static int reverseNumber(int num) {

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;

    }

    public static void main(String[] args) {
        int x = 123;
        int y = -123;
        int z = 120;

        System.out.println(reverseNumber(x));
        System.out.println(reverseNumber(y));
        System.out.println(reverseNumber(z));
    }
}
