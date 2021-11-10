package HackerRank.RealTestChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        fizzBuzz(n);
    }

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }



}

/***
 * Strings: Making Anagrams
 *
 * A student is taking a cryptography class and has found anagrams to be very useful.
 * Two strings are anagrams of each other if the first string's letters can be rearranged
 * to form the second string. In other words, both strings must contain the same exact
 * letters in the same exact frequency. For example, bacdc and dcbac are anagrams,
 * but bacdc and dcbad are not.
 *
 * The student decides on an encryption scheme that involves two large strings.
 * The encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. Determine this number.
 *
 * Given two strings,  and , that may or may not be of the same length, determine
 * the minimum number of character deletions required to make  and  anagrams.
 * Any characters can be deleted from either of the strings.
 *
 * Example
 *
 *
 * Delete  from  and  from  so that the remaining strings are  and  which are anagrams.
 * This takes  character deletions.
 *
 * Function Description
 *
 * Complete the makeAnagram function in the editor below.
 *
 * makeAnagram has the following parameter(s):
 *
 * string a: a string
 * string b: another string
 * Returns
 *
 * int: the minimum total characters that must be deleted
 * Input Format
 *
 * The first line contains a single string, .
 * The second line contains a single string, .
 *
 * Constraints
 *
 * The strings  and  consist of lowercase English alphabetic letters, ascii[a-z].
 * Sample Input
 *
 * cde
 * abc
 * Sample Output
 *
 * 4
 * Explanation
 *
 * Delete the following characters from the strings make them anagrams:
 *
 * Remove d and e from cde to get c.
 * Remove a and b from abc to get c.
 * It takes  deletions to make both strings anagrams.
 *
 * Input (stdin)
 * fcrxzwscanmligyxyvym
 * jxwtrhvujlmrpdoqbisbwhmgpmeoke
 *
 * Expected Output
 * 30
 */