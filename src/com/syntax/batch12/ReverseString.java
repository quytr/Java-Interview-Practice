package com.syntax.batch12;

public class ReverseString {
    /*
    Reverse a String without using loop or StringBuilder
     */

    public static String reverseString (String s){

        if(s.length() == 0){
            return s;
        }

        return s.charAt((s.length()-1)) + reverseString(s.substring(0, s.length()-1));


    }

    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(reverseString(s));




    }
}
