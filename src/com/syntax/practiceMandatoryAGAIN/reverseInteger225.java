package com.syntax.practiceMandatoryAGAIN;

public class reverseInteger225 {
     /*
Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
     */

    public static int reverseInteger(int N) {

        // https://medium.com/@ManBearPigCode/how-to-reverse-a-number-mathematically-97c556626ec6

        /*
        int N = 123;
        So first I will declare integer remainder variable to hold the remainder value
        and declare another integer reverse variable to store the reverse number;
        so I use while loop to loop through the number
        when the number is equal to 0 which mean the reverse is completed so I can exist the loop
        in the loop
        the remainder will be equal to 123 mod 10 which mean 3
        then I will store 3 to my reverse.
        Then reason reverse multiply by 10 because.............
        Then I will update my N number by divided by 10
         */

        int remainder;

        int reverse = 0;

        while (N != 0) {
            remainder = N % 10;
            reverse = reverse * 10 + remainder;
            N = N / 10;
        }
        return reverse;

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
}
