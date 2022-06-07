package com.syntax.question217;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    /*
    Having function GroupTotals (strArr) read in the strArr parameter containing key:value pairs where the key is a string
    and the value is an integer. Your program should return a string with the key:value pairs separated by a comma such
    that each key appears only once with the total values summed up.

    For example: if strArr is ["B:-1", "A:1", "B:3", "A:5"] then your program should return the string A:6, B:2

    Your final output string should return the keys in alphabetical order. Exclude keys that have a value of 0 after being
    summed up.

    Ex:
    Input: new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}
    Output: B:#, Y:1

    Input: new String[] {"Z:0", "A:-1}
    Output: A:-1
     */
    

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String[] arr = {"B:-1", "A:1", "B:3", "A:5"};    //Output = A:6, B:2
//        String[]arr = {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};  //Output =  B:3, X:-1, Y:1
//        String[] arr = {"Z:0", "A:-1"};                // Output = A:-1
        for (int i = 0; i < arr.length; i++) {
            String[] arr2;
            String key = null;
            int value = 0;
//            System.out.println(arr[i]);
            arr2 = arr[i].split(":");
//            System.out.println(Arrays.toString(arr2));
//            System.out.println(arr2.length);

            for (int j = 0; j < arr2.length -1; j++) {
                if (j % 2 == 0) {
                    key = arr2[j];

                } else {
                    value = Integer.parseInt(arr2[j]);
                }
                map.put(key, value);
                if (value == 0) {
                    map.remove(key, value);
                }

//                System.out.println(key);
            }
        }
        System.out.println(map);


    }
}


























