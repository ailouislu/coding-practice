package jdk.HackerRank.StringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakingAnagrams {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        System.out.println(makeAnagramMap(a, b));

        bufferedReader.close();
    }

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */
    public static int makeAnagramMap(String first, String second) {

        Map<Character, Integer> count = new HashMap<>();
        for( char ch: first.toCharArray() ) {
            int ct = count.getOrDefault(ch, 0);
            count.put(ch, (ct + 1));
        }

        for( char ch: second.toCharArray() ) {
            int ct = count.getOrDefault(ch, 0);
            count.put(ch, (ct - 1));
        }

        List<Integer> values = new ArrayList<>( count.values() );
        int total = 0;
        for( Integer v: values )
            total += Math.abs(v);

        return total;
    }

    public static int makeAnagramRegularExpression(String A, String B) {
        int repeatedCharacterNums = B.replaceAll("[^" + A + "]", "").length();

        return A.length() + B.length() - 2 * repeatedCharacterNums;
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