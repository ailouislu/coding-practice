package jdk.Codility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ArrayInversionCount {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = strArrayToIntArray(bufferedReader.readLine().split(" "));

        System.out.println(getArrayInversionCountLambda(inputNumbers));

        bufferedReader.close();
    }

    public static int getArrayInversionCount(int[] arr) {
        // write your code in Java SE 8
        int n = arr.length;
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }

    public static int getArrayInversionCountLambda(int[] arr) {
        AtomicInteger invCount = new AtomicInteger(0);
        IntStream.range(0, arr.length - 1).forEach(i -> {
            IntStream.range(i + 1, arr.length)
                    .filter(j -> arr[i] > arr[j])
                    .forEach(j -> invCount.getAndIncrement());
        });

        return invCount.get();
    }


    public static int[] strArrayToIntArrayLambda(String[] strings) {
        return Arrays.stream(strings)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
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
 * ArrayInversionCount
 * Given two integers A and B, return a string which contains A letters "a" and B
 * letters "b" with no three consecutive letters being the same.
 *
 * An array A consisting of N integers is given. An inversion is a pair of indexes (P, Q)
 * such that P < Q and A[Q] < A[P].
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that computes the number of inversions in A, or returns −1 if it exceeds 1,000,000,000.
 *
 * For example, in the following array:
 *
 *  A[0] = -1 A[1] = 6 A[2] = 3
 *  A[3] =  4 A[4] = 7 A[5] = 4
 * there are four inversions:
 *
 *    (1,2)  (1,3)  (1,5)  (4,5)
 * so the function should return 4.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 *
 * */