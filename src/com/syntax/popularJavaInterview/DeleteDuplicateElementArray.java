package com.syntax.popularJavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicateElementArray {
    /*
    For a given array A, write a code to delete the duplicate elements in the array
     */
    public static void main(String[] args) {
        String[] a = {"hello", "hi", "hi", "how are you", "hello", "hi", "good"};
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(a));
        System.out.println(set);
    }
}
