package jdk.HackerRank.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main (String[] args) throws Exception {

        List<Integer> arr = Arrays.asList(1,4,3,5,2,6,7);
        miniMaxSum2(arr);

    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int size = arr.size();
        int sum = 0;
        int max = arr.get(size-1);
        int min = arr.get(0);

        for(int i = 0; i < size; i++)
            sum += arr.get(i);

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void miniMaxSum2(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min = 0, max = 0;
        for(int i = 0, j = arr.size() - 1; i < arr.size() - 1; i++, j--){
            max = max + arr.get(j);
            min = min + arr.get(i);
        }
        System.out.println(min + " " + max);
    }


}

/***
 * jdk.HackerRank.Sorting: Bubble Sort
 *
 * Given two strings, determine if they share a common substring.
 * A substring may be as small as one character.
 *
 * Consider the following version of Bubble Sort:
 *
 * for (int i = 0; i < n; i++) {
 *
 *     for (int j = 0; j < n - 1; j++) {
 *         // Swap adjacent elements if they are in decreasing order
 *         if (a[j] > a[j + 1]) {
 *             swap(a[j], a[j + 1]);
 *         }
 *     }
 *
 * }
 * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above.
 * Once sorted, print the following three lines:
 *
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Hint: To complete this challenge, you must add a variable that keeps a running tally of all swaps
 * that occur during execution.
 *
 * Example
 *
 * swap    a
 * 0       [6,4,1]
 * 1       [4,6,1]
 * 2       [4,1,6]
 * 3       [1,4,6]
 * The steps of the bubble sort are shown above. It took  swaps to sort the array. Output is:
 *
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 6
 * Function Description
 *
 * Complete the function countSwaps in the editor below.
 *
 * countSwaps has the following parameter(s):
 *
 * int a[n]: an array of integers to sort
 * Prints
 *
 * Print the three lines required, then return. No return value is expected.
 *
 * Input Format
 *
 * The first line contains an integer, , the size of the array .
 * The second line contains  space-separated integers .
 *
 * Constraints
 *
 * Output Format
 *
 * Sample Input 0
 *
 * STDIN   Function
 * -----   --------
 * 3       a[] size n = 3
 * 1 2 3   a = [1, 2, 3]
 * Sample Output 0
 *
 * Array is sorted in 0 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 0
 * The array is already sorted, so  swaps take place.
 *
 * Sample Input 1
 *
 * 3
 * 3 2 1
 * Sample Output 1
 *
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 1
 * The array is not sorted, and its initial values are: . The following  swaps take place:
 *
 * At this point the array is sorted and the three lines of output are printed to stdout.
 */