package com.syntax.question218;

import java.util.*;

public class Main {
    /*
    Count the number of repetations of words in an ArrayList append that count and return that list. You need to implent a
    function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e how many times that word was present previously

More Exmaples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
     */


    public static List<String> countDeviceNames(List<String> deviceNames) {
        // create a arrat list to hold a unique name
        List<String> uniqueNames = new ArrayList<>();
        // for loop to go through the list to check duplicate
        for (int i = 0; i < deviceNames.size(); i++) {
            // create string variable to hold the name of given device name to check through the given array
            String name = deviceNames.get(i);
            // set duplicate is false, if duplicate is false, then we can add the name to unique array, if duplicate is true, continue to check
            boolean duplicate = false;
            // create another for loop, condition j < i to avoid array out of bond, to set duplicate is true if unique list contains variable name
            for (int j = 0; j < i; j++) {
                if (uniqueNames.get(j).equals(name)) {
                    duplicate = true;
                    break;
                }
            }
            // if duplicate is false, then simply add to the list.
            if (!duplicate) {
                uniqueNames.add(i, name);
                // if duplicate is true, then continue to check
            } else {
                // first set id = 1 to give the duplicate a unique name, id = 1 as it continuously counts, id is unique
                int id = 1;
                // like duplicate, create a boolean exist to check even with new name with id, if it exists on the unique list or not
                // first set it as true because we are on duplicate is true
                boolean exist = true;
                // create a while loop to check for the unique list again
                while (exist) {
                    // set exist to false to quit the loop
                    exist = false;
                    for (int j = 0; j < i; j++) {
                        // if the unique list contains the combine (name + id), then id increase 1
                        if (uniqueNames.get(j).equals(name + id)) {
                            id++;
                        }
                    }
                }
                uniqueNames.add(i, (name + id));
            }
        }

        return uniqueNames;
    }


    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("switch");
        a.add("TV");
        a.add("switch");
        a.add("TV");
        a.add("switch");
        a.add("TV");
        System.out.println(countDeviceNames(a));


        ArrayList<String> b = new ArrayList<>();
        b.add("switch");
        b.add("TV");
        b.add("switch");
        b.add("TV");
        b.add("radio");
        System.out.println(countDeviceNames(b));


        ArrayList<String> c = new ArrayList<>();
        c.add("switch");
        c.add("TV");
        System.out.println(countDeviceNames(c));

//        String[] devices = {"switch", "tv", "switch", "tv", "switch", "tv", "radio", "tv"};
//        System.out.println(deviceNamesSystem(Arrays.asList(devices)));

    }

//    public static List<String> deviceNamesSystem(List<String> deviceNames) {
//        String[] uniqueNames = new String[deviceNames.size()];
//        for (int i = 0; i < deviceNames.size(); i++) {
//            String name = deviceNames.get(i);
//            boolean duplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (uniqueNames[j].equals(name)) {
//                    duplicate = true;
//                    break;
//                }
//            }
//            if (!duplicate) {
//                uniqueNames[i] = name;
//            } else {
//                int id = 1;
//                boolean exists = true;
//                while (exists) {
//                    exists = false;
//                    for (int j = 0; j < i; j++) {
//                        if (uniqueNames[j].equals(name + id)) {
//                            exists = true;
//                            id++;
//                            break;
//                        }
//                    }
//                }
//                uniqueNames[i] = name + id;
//            }
//        }
//        return Arrays.asList(uniqueNames);
//    }
}




