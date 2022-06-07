package com.syntax.batch11;

import java.util.Map;
import java.util.TreeMap;

public class GroupTotals {
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
    //NOT DONE

    public static String groupTotals(String[] strArr) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String str : strArr
        ) {
            String[] arr = str.split(":");
            String key = arr[0];
            Integer value = Integer.parseInt(arr[1]);

            Integer gotValue = treeMap.get(key);
            if (gotValue == null) {
                treeMap.put(key, value);
            } else {
                treeMap.put(key, treeMap.get(key) + gotValue);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()
        ) {
            if (entry.getValue() != 0) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(":");
                stringBuilder.append(entry.getValue());
                stringBuilder.append(",");

            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"B:-1", "A:1", "B:3", "A:5"};    //Output = A:6, B:2
        String[]arr1 = {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};  //Output =  B:3, X:-1, Y:1
        String[] arr2 = {"Z:0", "A:-1"};                // Output = A:-1
        System.out.println(groupTotals(arr));
        System.out.println(groupTotals(arr1));
        System.out.println(groupTotals(arr2));
    }
}
