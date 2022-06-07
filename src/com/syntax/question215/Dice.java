package com.syntax.question215;


public class Dice {
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
