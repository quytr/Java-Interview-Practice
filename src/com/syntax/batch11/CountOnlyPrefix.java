package com.syntax.batch11;

import java.util.ArrayList;
import java.util.List;

public class CountOnlyPrefix {
    /*
Count how many times a given word from a list is present
as prefix in another list both lists will be given as input to the function

You have to implment a method that takes two lists as input one list
contains the query words that we want to search from the other list.

Word List ["steve","stevens","danny","steves","dan","john","johny" ,"joe" ,"alex" ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

As word steve is present as prefix in word stevens and steves
so we get 2 for it note we are not counting if we have the exact word in the original list

word alex is prefix in alexander so we get 1

word joe is not present as prefix so we get 0
     */

    public static List<Integer> countOnlyPrefix(List<String> wordList, List<String> queryWordList) {

        List<Integer> counts = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < queryWordList.size(); i++) {
            for (int j = 0; j < wordList.size(); j++) {
                if (wordList.get(j).contains(queryWordList.get(i)) && !wordList.get(j).equals(queryWordList.get(i))) {
                    count++;
                }
            }
            counts.add(count);
            count = 0;
        }

        return counts;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("steve");
        a.add("stevens");
        a.add("danny");
        a.add("steves");
        a.add("dan");
        a.add("john");
        a.add("johny");
        a.add("joe");
        a.add("alex");
        a.add("alexander");

        List<String> b = new ArrayList<>();
        b.add("steve");
        b.add("alex");
        b.add("joe");
        b.add("john");
        b.add("dan");

        System.out.println(countOnlyPrefix(a, b));

    }
}
