package jdk.Coderbyte;

import java.util.HashMap;
import java.util.Map;

public class FindIntersection {
    public static void main (String[] args) throws Exception {

//        String[] a = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
//        String[] a = new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        String[] a = new String[] {"1, 2, 4, 5, 6, 9", "2, 3, 4, 8, 10"};
        System.out.println(toFindIntersection(a));
    }

    public static String toFindIntersection(String[] strArr) {
        StringBuilder result = new StringBuilder();
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");
        Map<String,Integer> map = new HashMap<>();
        for(String a : arr1)
            map.put(a,1);

        for(String a : arr2)
            if(map.containsKey(a))
                result.append(a).append(",");

        int length = result.length();
        if(length == 0)
            return "false";

        return result.substring(0, length - 1);
    }

}

/****
 * Find Intersection

 Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
 Examples
 Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
 Output: 1,4,13
 Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
 Output: 1,9,10
 Tags
 arrayfreevideo
 */