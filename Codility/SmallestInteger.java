package Codility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestInteger {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = strArrayToIntArray(bufferedReader.readLine().split(","));

        System.out.println(getSmallestInteger(inputNumbers));

        bufferedReader.close();
    }

    public static int getSmallestInteger(int[] a) {
        // write your code in Java SE 8
        Arrays.sort(a);
        int length = a.length;
        int biggestNum = a[length - 1];
        if (biggestNum <= 1)
            return 1;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            map.put(a[i], 1);
        }

        int result = 0;
        for(int i = 1; i <= biggestNum; i++){
            if(map.getOrDefault(i,2) == 2 && result < i ){
                result = i;
                break;
            }
        }

        if(result == 0)
            result = biggestNum + 1;

        return result;
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i].trim());
        }

        return ints;
    }

}

/****
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */