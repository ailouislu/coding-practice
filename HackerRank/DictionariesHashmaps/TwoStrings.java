package HackerRank.DictionariesHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoStrings {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();
                String s2 = bufferedReader.readLine();

                System.out.println(twoStrings(s1, s2));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */
    public static String twoStrings(String s1, String s2) {
        var map = new HashMap<String, Integer>();
        String m;

        for(int i = 0; i < s1.length(); i++) {
            m = String.valueOf(s1.charAt(i));
            if (map.get(m) != null) {
                map.put(m, map.get(m) + 1);
                continue;
            }

            map.put(m, 1);
        }

        String n;
        for (int j = 0; j < s2.length(); j++) {
            n = String.valueOf(s2.charAt(j));
            if (map.get(n) != null)
                return "YES";
        }

        return "NO";
    }

}

/***
 * Two Strings
 *
 * Given two strings, determine if they share a common substring.
 * A substring may be as small as one character.
 *
 * Example
 *
 * These share the common substring .
 *
 * These do not share a substring.
 *
 * Function Description
 *
 * Complete the function twoStrings in the editor below.
 *
 * twoStrings has the following parameter(s):
 *
 * string s1: a string
 * string s2: another string
 * Returns
 *
 * string: either YES or NO
 * Input Format
 *
 * The first line contains a single integer , the number of test cases.
 *
 * The following  pairs of lines are as follows:
 *
 * The first line contains string .
 * The second line contains string .
 * Constraints
 *
 *  and  consist of characters in the range ascii[a-z].
 * Output Format
 *
 * For each pair of strings, return YES or NO.
 *
 * Sample Input
 *
 * 2
 * hello
 * world
 * hi
 * world
 * Sample Output
 *
 * YES
 * NO
 * Explanation
 *
 * We have  pairs to check:
 *
 * , . The substrings  and  are common to both strings.
 * , .  and  share no common substrings.
 */