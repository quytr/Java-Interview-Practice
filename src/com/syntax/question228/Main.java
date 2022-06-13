package com.syntax.question228;

public class Main {
    /*
    Count the number of characters in the last word of a String

"I love Java" => 4

"i love coding" =>6

"sun" =>3

""=>0
     */

    public static int countLastWordChar(String str) {

        String[] arrStr = str.split(" ");
        return arrStr[arrStr.length - 1].length();

    }


    public static void main(String[] args) {
        String a = "I love Java";
        System.out.println(countLastWordChar(a));

        String b = "I love coding";
        System.out.println(countLastWordChar(b));

        String c = "sun";
        System.out.println(countLastWordChar(c));

        String d = "";
        System.out.println(countLastWordChar(d));

    }
}
