package com.syntax.question223;

import java.util.Scanner;

public class Main {
    /*
    Write logic in the main method to print a pyramid of numbers the logic should be generic i.e.
    it can print the pyrmid for any numbmer like 5, 6, 7 etc
    if input is 2 output should be

2

2 2

if input is 3 the output should be

3

3 3

3 3 3

Ask user input for the number for which he wants to make the pyramid using scanner
     */

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Which number you want to make the pyramid? 1-9");
//
//        int numb = scanner.nextInt();
//
//        for (int i = 0; i < numb; i++) {
//            for (int j = numb - i; j > 1; j--) {
//
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(numb + " ");
//            }
//            System.out.println();
//
//        }

        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }


    }
}

