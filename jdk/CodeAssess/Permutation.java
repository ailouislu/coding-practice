package jdk.CodeAssess;

import java.io.*;
import java.util.Arrays;

public class Permutation {
    public static void main (String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String[] inputString = new String[11];
        int[] inputNumbers1 = new int [11];
        int[] inputNumbers2 = new int [11];

        while((line=br.readLine()) != null) {
            inputString = line.split(" ");

            if (count == 0){
                inputNumbers1 = strArrayToIntArray(inputString);
                count++;
            }
            else {
                inputNumbers2 = strArrayToIntArray(inputString);
                System.out.println(arePermutation(inputNumbers1, inputNumbers2));
                count = 0;
            }
        }
    }

    public static String arePermutation (int[] numbers1, int[] numbers2){
        if (numbers1.length != numbers2.length) return "NO";

        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        for (int j : numbers1) {
            int resultNumber1 = Arrays.binarySearch(numbers1, j);
            int resultNumber2 = Arrays.binarySearch(numbers2, j);
            if (resultNumber1 != resultNumber2) return "NO";
        }

        return "YES";

    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

}

/***
 * Permutation
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests the knowledge of array operations, such as sorting and comparison.
 * The main idea here is to assure the logical thinking of permutations.
 * Recommended time for solving this problem:
 * 15 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Strings, Search, Sorting, Arrays, Loops, For loop, While loop, Foreach loop,
 * Do while loop, If condition, If else condition, Logical operations, Logical operators,
 * Data Conversion, Type Conversion, Print, Output, Input Output, STDIN STDOUT, Console Read,
 * Console Write, Split
 * Problem Text:
 * 9/10
 * Write a program that takes two 11 integer array elements (one input per line) and
 * gives output YES, if there's a permutation of the first array that is equal to
 * the second array or gives output NO, if there's no such permutation.
 *
 * Example
 *
 * Case 1
 * For input provided as follows:
 *
 * 1 2 5 3 7 0 7 3 5 2 1
 * 7 3 1 2 5 0 5 2 1 3 7
 *
 * 1 2 5 3 7 0 7 3 5 2 1
 * 7 3 1 2 5 0 5 2 1 3 5
 *
 * Output of the program will be:
 *
 * YES
 *
 * Description:
 *
 * We can check that the first array can be changed to the following array:
 *
 * 7 3 1 2 5 0 5 2 1 3 7
 *
 * So that makes the first array a permutation of the second array, giving answer YES.
 *
 * Case 2
 * For the input provided as follows:
 *
 * 1 2 3 4 5 6 7 8 9 10 11
 * 6 5 4 3 2 0 11 10 9 8 7
 *
 * 1 2 3 4 5 6 7 8 9 10 1
 * 6 5 4 3 2 0 11 10 9 8 1
 *
 * Output of the program will be:
 *
 * NO
 *
 * Description:
 *
 * The first array can not be a permutation of the second array since
 * the first array doesn't have the number 0 that is present on the second array.
 */