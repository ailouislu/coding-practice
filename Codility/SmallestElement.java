package Codility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestElement {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = strArrayToIntArray(bufferedReader.readLine().split(","));

        System.out.println(getSmallestElement(inputNumbers));

        bufferedReader.close();
    }

    /***
     * Find the bug(s) and modify one line of code in the incorrect
     * implementation of a function solution that is supposed to
     * return the smallest element of the given non-empty array A
     * which contains at most 1000 integers within range [-1000.. 10001.
     * Notice that for the example test case A = [-1, 1, -2, 2] the attached code
     * is already returning the correct answer (-2).
     */
    public static int getSmallestElement(int[] A) {
        //int ans = 0;
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }

        return ans;
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i].trim());
        }

        return ints;
    }

}
