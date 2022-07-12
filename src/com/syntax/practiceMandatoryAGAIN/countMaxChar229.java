package com.syntax.practiceMandatoryAGAIN;

public class countMaxChar229 {
     /*
    Count the maximum repetition of a character examples are given below

"abscaaaaabdddd" -> 6

"dddddddddd" -> 10

"daccccdndeeeennnnndddddd" -> 9

"a"->1

""-> 0
     */

    public static int countMaxChar(String str) {

        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            count = 1;
        }
        return maxCount;

    }

    public static void main(String[] args) {

        String a = "abscaaaaabdddd";
        System.out.println(countMaxChar(a));

        String b = "dddddddddd";
        System.out.println(countMaxChar(b));

        String c = "daccccdndeeeennnnndddddd";
        System.out.println(countMaxChar(c));

        String d = "a";
        System.out.println(countMaxChar(d));

        String e = "";
        System.out.println(countMaxChar(e));
    }
}
