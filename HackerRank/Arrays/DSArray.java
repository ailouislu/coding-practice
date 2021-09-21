package HackerRank.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DSArray {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        List<List<Integer>> inputArraysList = new ArrayList<>();

        while((line=br.readLine()) != null) {
            try {
                inputArraysList.add(
                        Stream.of(line.replaceAll("[^0-9.]", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
                );
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

            if(count == 5) {
                System.out.println(hourglassSummary(inputArraysList));
                count = 0;
                continue;
            }
                count++;
        }
    }

    public static int hourglassSummary(List<List<Integer>> arr){
        int[] sums = new int[16];
        int count = 0;

        for(int i = 0; i< arr.size()-2; i++){
            for(int j = 0; j< arr.size()-2; j++){
                sums[count] = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1)
                        + arr.get(i+2).get(j+2);

                count++;
            }
        }

        Arrays.sort(sums);
        return sums[sums.length-1];
    }

}

/***
 * 2D Array - DS
 *
 * Given a  2D Array, :
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * An hourglass in  is a subset of values with indices falling in this pattern
 * in 's graphical representation:
 *
 * a b c
 *   d
 * e f g
 * There are  hourglasses in . An hourglass sum is the sum of an hourglass' values.
 * Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 * The array will always be .
 *
 * Example
 *
 *
 * -9 -9 -9  1 1 1
 *  0 -9  0  4 3 2
 * -9 -9 -9  1 2 3
 *  0  0  8  6 6 0
 *  0  0  0 -2 0 0
 *  0  0  1  2 4 0
 * The  hourglass sums are:
 *
 * -63, -34, -9, 12,
 * -10,   0, 28, 23,
 * -27, -11, -2, 10,
 *   9,  17, 25, 18
 * The highest hourglass sum is  from the hourglass beginning at row , column :
 *
 * 0 4 3
 *   1
 * 8 6 6
 * Note: If you have already solved the Java domain's Java 2D Array challenge,
 * you may wish to skip this challenge.
 *
 * Function Description
 *
 * Complete the function hourglassSum in the editor below.
 *
 * hourglassSum has the following parameter(s):
 *
 * int arr[6][6]: an array of integers
 * Returns
 *
 * int: the maximum hourglass sum
 * Input Format
 *
 * Each of the  lines of inputs  contains  space-separated integers .
 *
 * Constraints
 *
 * Output Format
 *
 * Print the largest (maximum) hourglass sum found in .
 *
 * Sample Input
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 *
 * 19
 * Explanation
 *
 *  contains the following hourglasses:
 *
 * image
 *
 * The hourglass with the maximum sum () is:
 *
 * 2 4 4
 *   2
 * 1 2 4
 */