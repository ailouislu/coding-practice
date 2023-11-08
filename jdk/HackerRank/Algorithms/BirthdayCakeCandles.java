package jdk.HackerRank.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main (String[] args) throws Exception {
        List<Integer> arr = Arrays.asList(3,2,1,1,2,1);
        System.out.println(birthdayCakeCandles(arr));
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int maxCount = 0;
        int size = candles.size();
        int max = candles.get(size - 1);
        for(int i = size - 1; i >= 0; i --)
            if(max == candles.get(i))
                maxCount ++;

        return maxCount;
    }



}

/***
 * jdk.HackerRank.Algorithms Warmup: Birthday Cake Candles
 *
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 *
 * Example
 *
 *
 * The maximum height candles are  units high. There are  of them, so return .
 *
 * Function Description
 *
 * Complete the function birthdayCakeCandles in the editor below.
 *
 * birthdayCakeCandles has the following parameter(s):
 *
 * int candles[n]: the candle heights
 * Returns
 *
 * int: the number of candles that are tallest
 * Input Format
 *
 * The first line contains a single integer, , the size of .
 * The second line contains  space-separated integers, where each integer  describes the height of .
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 4
 * 3 2 1 3
 * Sample Output 0
 *
 * 2
 * Explanation 0
 *
 * Candle heights are . The tallest candles are  units, and there are  of them.
 * */