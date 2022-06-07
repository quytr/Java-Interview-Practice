package com.syntax.question215;

public class BalancedParenthesis {
    /*
    A bracket is considered to be of the following characters: (, ).

Two brackets are considered to be a matched pair if the an opening bracket "(" occurs to the left of a closing bracket ")" of the exact same type.

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, "(()" is not balanced because the contents is not balanced.

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets. The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.

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

    public static class Dice {
        //Let's create a game where we roll a die, and move a player around a game board.
    //The board has 40 spaces, arranged in a circle
    //
    //The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
    //- roll the die (each die has a random value, 1-6)
    //- print player start position, die value, and ending position
    //
    //sample output:
    //
    //    //     start=0, roll=3, end=3
    //    //     start=3, roll=2, end=5
    //    //     ...
    ////     start=38, roll=6, end=4


        public static void main(String[] args) {
            int spaces = 40;  //the board has 40 spaces
            int start = 0;  // start at position 0
            int end = 0;    // end at position 0

            // loo[ 30 times
            for (int i = 0; i < 30; i++) {
                // roll the dice randomly by using Math.random()
                // syntax: (int)Math.floor(Math.random()*(max-min+1)+min)
                // min = 1, max = 6 (dice 1-6)
                int roll = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
                // if (start + randomRoll) < 40(spaces), then end = (start + randomRoll)
                if ((start + roll) < spaces) {
                    end = start + roll;
                //if (start + randomRoll) >= 40(spaces)
                }else if((start + roll) >= spaces){
                    // the board is circle, so at spaces = 40 (end point) = 0 (start point)
                    end = start + roll - spaces;
                }

                System.out.println("start = " + start + ", roll = " + roll + ", end = " + end);
                //update start point
                start =end;


            }
        }
    }
}
