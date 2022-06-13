package com.syntax.question225;

public class Main {
    /*
Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
     */

    public static int reverseInteger(int N) {

        // remainder will hold the last number
        int remainder;
        // reverse will keep adding the number in reverse back
        int reverse = 0;

        while (N != 0) {
            // to get the last number, the remainder of given number divide by 10 is the last number
            remainder = N % 10;
            // to store it, multiply by 10 then plus remainder
            reverse = reverse * 10 + remainder;
            // to update the given number by divide by 10
            N = N / 10;
        }

        return  reverse;

    }

    public static void main(String[] args) {
        int a = 123;
        System.out.println(reverseInteger(a));

        int b = 12345;
        System.out.println(reverseInteger(b));

        int c = 1001;
        System.out.println(reverseInteger(c));

        int d = 789;
        System.out.println(reverseInteger(d));
    }

    /*
    Example:
number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123

number = 123
remainder = 123 % 10 = 3
reverse = 4 * 10 + 3 = 40 + 3 = 43
number = 123 / 10 = 12

number = 12
remainder = 12 % 10 = 2
reverse = 43 * 10 + 2 = 430 + 2 = 432
number = 12 / 10 = 1

number = 1
remainder = 1 % 10 = 1
reverse = 432 * 10 + 1 = 4320 + 1 = 4321
number = 1 / 10 = 0

     */
}
