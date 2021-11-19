package Codility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CostsOfDeletingLetters {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        int[] inputNumbers = strArrayToIntArray(bufferedReader.readLine().split(","));

        System.out.println(getCostsOfDeletingLetters(inputString, inputNumbers));

        bufferedReader.close();
    }

    public static int getCostsOfDeletingLetters(String s, int[] costs) {
        // write your code in Java SE 8
        int totalCosts = 0;
        int max = costs[0];
        int cTotalCosts = costs[0];
        int length = s.length();

        for(int i = 1; i < length; i++)
        {
            if(s.charAt(i) != s.charAt(i-1))
            {
                totalCosts += cTotalCosts - max;
                cTotalCosts = max = costs[i];
                continue;
            }

            cTotalCosts += costs[i];
            max = Math.max(max, costs[i]);
        }
        totalCosts += cTotalCosts - max;

        return totalCosts;
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
 * Costs Of Deleting Letters
 *
 * You are given a string S. Deletion of the K-th letter of S costs C[K].
 * After deleting a letter, the costs of deleting other letters do not change.
 * For example, for S= "ab" and C = [1, 3], after deleting 'a', deletion of 'b'
 * will still cost 3. You want to delete some letters from S to obtain a string
 * without two identical letters next to each other. What is the minimum total cost
 * of deletions to achieve such a string? Write a function:class Solution
 * (public int solution(String s, int[] C); }that, given string S and array C of integers,
 * both of length N, returns the minimum cost of all necessary deletionsExamples:
 * 1. Given S= "abccbd" and C = [0,1, 2,3, 4, 5] the function should return
 * 2. You can delete the first occurrence of 'c' to achieve "abcbd"
 * 2. Given S= "aabbcc" and C = [1,2, 1, 2, 1, 2], the function should return
 * 3. By deleting all letters with cost of 1, you can achieve string "abc"
 * 3. Given S = "aaaa" and C = [3, 4, 5, 6,1] the function should return
 * 12. You need to delete all but one letter 'a', and the lowest cost of deletions is 3+4+5-12.
 * 4. Given S = "ababa" and C =[10, 5, 10, 5, 10], the function should return 0.
 * There is no need to delete any letterWrite an efficient algorithm for the following assumptions:
 * string S and array C have length equal to NN is an integer within the range [1..100,000];
 * string S consists only of lowercase letters ('a'-'z)each element of array C is an integer within
 * the range [0..1,000].
 */