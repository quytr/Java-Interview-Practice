package com.syntax.practiceMandatoryAGAIN;

public class reverse226 {
    /*
    Reverse the String without using the Reverse method from the BtringBuilder Class

input["I am a java Programmer"] output["Programmer java a am I"]

input["Syntax is Great"] output["Great is Syntax"]
     */

    public static String reverse(String strToRev) {

        String[] arrStr = strToRev.split(" ");
        String reStr = "";
        for (int i = arrStr.length - 1; i >= 0; i--) {
            reStr = reStr + arrStr[i] + " ";
        }
        return reStr.trim();


    }

    public static void main(String[] args) {
        String a = "I am a java Programmer";
        System.out.println(reverse(a));

        String b = "Syntax is Great";
        System.out.println(reverse(b));
    }
}
