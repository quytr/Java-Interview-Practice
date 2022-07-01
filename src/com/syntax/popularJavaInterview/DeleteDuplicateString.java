package com.syntax.popularJavaInterview;

import java.util.*;

public class DeleteDuplicateString {
    /*
    For a given String S, write a program to remove duplicate elements from the String
     */

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        char[] ch =s.toCharArray();
        System.out.println(Arrays.toString(ch));

        Set<Character> set = new LinkedHashSet<>();
        for(char c : ch){
            set.add(c);
        }

        System.out.println(set);

        for (char c : set){
            System.out.print(c);
        }

    }

}
