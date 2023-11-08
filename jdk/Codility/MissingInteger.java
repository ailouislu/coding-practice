package jdk.Codility;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
    public static void main (String[] args) throws Exception {

        int[] a = {1, 3, 6, 4, 1, 2};
//        int[] a = {1, 2, 3};
//        int[] a = {−1, −3};
        System.out.println(findMissingInteger(a));
    }

    public static int findMissingInteger(int[] a) {
        int length = a.length;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i <= length + 1; i ++)
            map.put(i, 1);

        for (int j : a)
            if (map.containsKey(j))
                map.remove(j);

        int count = 0;
        for(int k : map.keySet()){
            count += 1;
            if(count == 1)
                result = k;
        }

        return result;
    }

}

/****
 * PermCheck: Check whether array A is a permutation.

 A non-empty array A consisting of N integers is given.

 A permutation is a sequence containing each element from 1 to N once, and only once.

 For example, array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 is a permutation, but array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 is not a permutation, because value 2 is missing.

 The goal is to check whether array A is a permutation.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

 For example, given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2
 the function should return 1.

 Given array A such that:

 A[0] = 4
 A[1] = 1
 A[2] = 3
 the function should return 0.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [1..1,000,000,000].
 */