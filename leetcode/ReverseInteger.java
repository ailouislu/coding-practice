package leetcode;

import java.util.List;
import java.util.stream.IntStream;

public class ReverseInteger {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console

        int x = 123;
        int y = -123;
        int z = 120;
        int k = 0;
        int j = 15342311;

        System.out.println(reverseIntStream(j));
    }

    public static int reverseIntStream (int y) {
        IntStream.iterate(10, x -> x >= 0, x -> x - 1)
                 .forEach(System.out::println);

        return 1;
    }

    public static int reverseStream (int x) {
        List<Integer> list = List.of(x);
        int[] numstream =  list.stream()
                 .mapToInt(ReverseInteger::reverse)
                 .toArray();

        int sum = 0;
        for(int j = numstream.length-1; j >= 0; j--)
            sum = sum * 10 + numstream[j];

        return sum;
    }

    public static int reverse (int x) {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10; // Dividing the value by % gives us remainder back so. We can get the last value
            int newResult = result * 10 + tail; // in the newresult adding the tail value which we got because let say we have something like
            //this 123, and from tail we got 3. Now what will happen when we add 2 after 3 when we come back we have something like
            //30 + 2 = 32 and again we come back with carrying 1 we have 320 + 1 = 321, Integer is reversed.

            if ((newResult - tail) / 10 != result) // checking if it's not valid. Return 0.
                return 0;

            result = newResult; // dumping the newResult value in result
            x = x / 10; // updating our x integer/
        }

        return result;
    }
}

/***
 * Reverse Integer
 * Easy
 *
 * 5597
 *
 * 8364
 *
 * Add to List
 *
 * Share
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer
 * range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 * Accepted
 * 1,749,370
 * Submissions
 * 6,698,712
 */
