package com.syntax.practiceMandatoryAGAIN;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicates217 {
    /*
     Complete countDuplicates method This method should count how many numbers
     are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
     */
    public static int countDuplicates(List<Integer> numbers) {

        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    duplicates.add(numbers.get(i));
                }
            }
        }

        return duplicates.size();

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(12);
        a.add(13);
        a.add(45);
        a.add(78);
        a.add(7);
        a.add(7);
        System.out.println(countDuplicates(a));

        List<Integer> b = new ArrayList<>();
        b.add(12);
        b.add(12);
        b.add(7);
        b.add(7);
        b.add(7);
        b.add(7);
        b.add(7);
        System.out.println(countDuplicates(b));

        List<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(120);
        c.add(13);
        c.add(45);
        c.add(78);
        c.add(17);
        c.add(57);
        System.out.println(countDuplicates(c));

        List<Integer> d = new ArrayList<>();
        d.add(12);
        d.add(12);
        d.add(13);
        d.add(45);
        d.add(67);
        d.add(87);
        d.add(7);
        System.out.println(countDuplicates(d));


    }
}
