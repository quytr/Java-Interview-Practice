package com.syntax.question215;

public class MANDATORY {
    /*
    A bracket is considered to be of the following characters: (, ).

Two brackets are considered to be a matched pair if the an opening bracket "("
 occurs to the left of a closing bracket ")" of the exact same type.

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched.
For example, "(()" is not balanced because the contents is not balanced.

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets. The subset of brackets enclosed within the confines of
a matched pair of brackets is also a matched pair of brackets.
Given strings of brackets, determine whether each sequence of brackets is balanced.
If a string is balanced, return true. Otherwise, return false.

Function Description

Complete the function isBalanced in the editor below.

isBalanced has the following parameter(s):

string s: a string of brackets Returns

string: either true or false

Examples

input "(()" -> false

input "(" -> false

input ")" -> false

input "(()))" -> false

input "(())" -> true

input "()" -> true

input ")()(" -> true
     */
    public static boolean isBalanced(String s) {

        // check the size of the string
        int originalSize = s.length();
        // find how many ( left brackets are there in the string by delete all the ) right bracket
        // and whatever left in the string, use length() to check how many left
        int leftBracketSize = s.replaceAll("[)]", "").length();
        // to find the ) right brackets:
        int rightBracketSize = originalSize - leftBracketSize;
        // if the right brackets and the left brackets are equal (or the subtraction of them = 0)
        // which mean left and right brackets are paired
        return (leftBracketSize == rightBracketSize) ;

    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()))))"));
        System.out.println(isBalanced("(()"));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("(()))"));
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced(")()("));
        System.out.println(isBalanced("()))))))))))))))))))))))()()))()))))))))()))))))()))()))))(()))))))))))))()))))))(()))))))))()()))))))))))))()))))(())()))))))(()))))()))))))()))()())))())))))))))))()))())(()()())()()())))))()))))())()))()))))))))))))))()())))()))))()))))))()))())()))())))(()))()))))))))())))())))(())()))))()((()))))))((((()())())())(())))))())())))))))())))))()(()))))()))))())))))()())())()))()))))))))()))))))))))()))))())))))(((()))))()))((())))())))))))())))()()())())))))())))())())))))(())())))))))())))()()))))))))))))(())())())))((()))))))(())))()())))()))))(())))(())))))))))))))(())))(())()))))(()))())())))))))()())(()(())())))))))))))))))))))))))((()())))())))())))((()())))()))())()))))())()())))))))))))(()))))))))))))))()))))))()))))))))))))))))(()(()))(()))()))))))()))()()))))))))))()))())()))))())))()()()))()))))(())))))))))))))()()))))(())))()))))))()))()())()))())()())())))()()(()())))))()())))))))())))())))(())))())))))))()))))))))()((()(())))))))))(())))())))())))))))))()())))()))))))))("));


    }

}
