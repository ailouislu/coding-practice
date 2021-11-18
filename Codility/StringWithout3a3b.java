package Codility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringWithout3a3b {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumbers = strArrayToIntArray(bufferedReader.readLine().split(" "));

        System.out.println(getStringWithout3a3b(inputNumbers[0], inputNumbers[1]));

        bufferedReader.close();
    }

    public static String getStringWithout3a3b(int A, int B) {
        // write your code in Java SE 8
        StringBuilder ans = new StringBuilder();

        while (A > 0 || B > 0) {
            boolean writeA = false;
            int L = ans.length();
            if (L >= 2 && ans.charAt(L-1) == ans.charAt(L-2)) {
                if (ans.charAt(L-1) == 'b')
                    writeA = true;
            } else {
                if (A >= B)
                    writeA = true;
            }

            if (writeA) {
                A--;
                ans.append('a');
            } else {
                B--;
                ans.append('b');
            }
        }

        return ans.toString();
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
 * Three Letters
 * Given two integers A and B, return a string which contains A letters "a" and B letters "b" with no three consecutive letters being the same.
 *
 * Write a function solution that, given two integers A and B, returns a string containing exactly A letters 'a' and exactly B letters 'b' with no three consecutive letters being the same (in other words, neither "aaa" nor "bbb" may occur in the returned string).
 *
 * Examples:
 *
 * 1. Given A = 5 and B = 3, your function may return "aabaabab". Note that "abaabbaa" would also be a correct answer. Your function may return any correct answer.
 *
 * 2. Given A = 3 and B = 3, your function should return "ababab", "aababb", "abaabb" or any of several other strings.
 *
 * 3. Given A = 1 and B = 4, your function should return "bbabb", which is the only correct answer in this case.
 *
 * Assume that:
 *
 * A and B are integers within the range [0..100];
 * at least one solution exists for the given A and B.
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */