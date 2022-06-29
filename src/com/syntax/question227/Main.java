package com.syntax.question227;

import java.util.LinkedList;

public class Main {
    /*
HTML Elements Have the function HTMLElements (str) read the str parameter being passed which will be a string of HTML DOM elements and plain text.
The elements that will be used are: b, i, em, div, p. For example:

if str is < div>< b>< p>hello world< /p>< /b> < /div>

then this string of DOM elements is nested correctly so your program should return the string true.
If a string is not nested correctly, return the first element encountered where, if changed into a different element,
would result in a properly formatted string.
If the string is not formatted properly, then it will only be one element that needs to be changed.

For example: if str is '< div> < i>hello< /i>world< /b>" then your program should return the string div
because if the first < div> element were changed into a < b>,
the string would be properly formatted.

Examples
Input: "< div>< div>< b>< /b>< /div>< /p>"
Output: div

Input: "< div>abc< /div>< p>< em>< i>test test test< /b>< /em>< /p>"
Output: i
     */

    public static String HTMLElements(String str) {

        // create a LinkedList to hold the opening HTML elements
        // using LinkedList because it's faster to retrieve an elements and faster to update the List
        LinkedList<String> elements = new LinkedList<>();
        // create a array String using split method to remove <>
        String[] strings = str.split("[<>]");

        // using for loop to iterate the array
        for (String string : strings) {
            // if the string has 5 given HTML tags such as b, i, em, div, p then add it to the List element
            if (string.equals("b") || string.equals("i") || string.equals("em") || string.equals("div") || string.equals("p")) {
                elements.add(string);
            }
            // if the string has the closing tags then check
            // if the List element is empty or not, if the list is empty then return true (which mean the given string does not use any HTML tags)
            if (string.equals("/b") || string.equals("/i") || string.equals("/em") || string.equals("/div") || string.equals("/p")) {
                if (elements.size() != 0) {
                    // initialize a String variable name openElement to store the last element (HTML tag) of List element
                    // so we can compare it with the closing HTML tags
                    // the first opening tag will have the last closing tag
                    String openElement = elements.getLast();
                    // compare if the last opening tag is equal to the current closing tag that we remove the /
                    // if it's true, then we remove the opening tag to the List, whatever we have left will be the element needs to be changed (to get the correct format)
                    if (openElement.equals(string.substring(1))) {
                        elements.removeLast();
                    } else {
                        return elements.getLast();
                    }
                }
            }
        }
        // return true when given string has no HTML tags or all the HTML tags are formatted correctly
        return "true";

    }

    public static void main(String[] args) {

        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
}
