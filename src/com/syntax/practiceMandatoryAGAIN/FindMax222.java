package com.syntax.practiceMandatoryAGAIN;

import java.util.ArrayList;
import java.util.List;

public class FindMax222 {
    /*
   Write the logic that picks largest and second largest numbers from a list
   add them and return the results.
   input to method is a list that contains the numbers
input [10,20,30,40]

output [70]

input[5,3,8,9,10,11,5]

output [21]
    */
    public static int findMaxSum(List<Integer> list) {

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number > largest) {
                secLargest = largest;
                largest = number;
            } else if (number < largest && number > secLargest) {
                secLargest = number;
            }
        }
        return largest + secLargest;
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
