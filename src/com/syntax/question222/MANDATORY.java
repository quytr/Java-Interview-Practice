package com.syntax.question222;

import java.util.ArrayList;
import java.util.List;

public class MANDATORY {
    /*
    Write the logic that picks largest and second largest numbers from a list add them and return the results.
    input to method is a list that contains the numbers
input [10,20,30,40]

output [70]

input[5,3,8,9,10,11,5]

output [21]
     */

    public static int findMaxSum(List<Integer> list) {
        // assign largest number and second largest to the smallest integer value
        int largestNumber = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // use for loop to go through the list
        for (int i = 0; i < list.size(); i++) {
            int numb = list.get(i);
            // compare each number to largest and second largest, if met the condition, reassign the variable
            if (numb > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = numb;
            } else if (numb < largestNumber && numb > secondLargest) {
                secondLargest = numb;
            }
        }
        // return the sum of the largest number and second largest
        return largestNumber + secondLargest;

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(findMaxSum(list));

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(5);
        System.out.println(findMaxSum(list1));
    }
}
