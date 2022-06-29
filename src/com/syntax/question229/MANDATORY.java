package com.syntax.question229;


public class MANDATORY {
    /*
    Count the maximum repetition of a character examples are given below

"abscaaaaabdddd" -> 6

"dddddddddd" -> 10

"daccccdndeeeennnnndddddd" -> 9

"a"->1

""-> 0
     */

    public static int countMaxChar(String str) {

        char[] arrStr = str.toCharArray();

        int max_count = 0;
        int count = 1;
        int size = str.length();

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (arrStr[i] == arrStr[j]) {
                    count++;
                } else {
                    if (count > max_count) {
                        max_count = count;
                    }
                    count = 1;
                }
            }
        }
        if (count > max_count) {
            max_count = count;
        }

        return max_count;


    }

    public static void main(String[] args) {
        

//        String a = "abscaaaaabdddd";
//        System.out.println(countMaxChar(a));
//
//        String b = "dddddddddd";
//        System.out.println(countMaxChar(b));
//
//        String c = "daccccdndeeeennnnndddddd";
//        System.out.println(countMaxChar(c));
//
//        String d = "a";
//        System.out.println(countMaxChar(d));

        String e = "";
        System.out.println(countMaxChar(e));
    }
}
/*
char[] array = S.toCharArray()
int count = 1;
int max = 0;
char maxChar = 0;
for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
    if(array[i]==array[i-1]){
        count++;
    } else {
        if(count>max){  // Record current run length, is it the maximum?
            max=count;
            maxChar=array[i-1];
        }
        count = 1; // Reset the count
    }
}
if(count>max){
    max=count; // This is to account for the last run
    maxChar=array[array.length-1];
}
System.out.println("Longest run: "+max+", for the character "+maxChar); // Print the maximum.
 */
