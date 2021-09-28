package HackerRank.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LeftRotationArrays {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        List<Integer> inputArraysList;
        List<Integer>  inputList;
        int offset = 0;

        try {
            while((line = br.readLine()) != null) {
                if(count == 0){
                    inputList = Stream.of(line.replaceAll("\\s+$", "")
                                              .split(" "))
                                              .map(Integer::parseInt)
                                              .collect(toList());

                    offset = inputList.get(1);
                    count++;
                    continue;
                }


                    inputArraysList =
                            Stream.of(line.replaceAll("\\s+$", "")
                                          .split(" "))
                                          .map(Integer::parseInt)
                                          .collect(toList());

                    System.out.println(leftRotation(inputArraysList, offset));
                    count = 0;

            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<Integer> leftRotation(List<Integer> arr, int offset){
        List<Integer> returnList = new ArrayList<>();
        List<Integer> moveList = arr.subList(offset, arr.size());

        arr = arr.subList(0, offset);
        returnList.addAll(moveList);
        returnList.addAll(arr);

        return returnList;
    }

}

/***
 * HackerRank.Arrays: Left Rotation
 *
 * A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
 *
 * Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 *
 * Function Description
 *
 * Complete the function rotLeft in the editor below.
 *
 * rotLeft has the following parameter(s):
 *
 * int a[n]: the array to rotate
 * int d: the number of rotations
 * Returns
 *
 * int a'[n]: the rotated array
 * Input Format
 *
 * The first line contains two space-separated integers  and , the size of  and the number of left rotations.
 * The second line contains  space-separated integers, each an .
 *
 * Constraints
 *
 * Sample Input
 *
 * 5 4
 * 1 2 3 4 5
 * Sample Output
 *
 * 5 1 2 3 4
 * Explanation
 *
 * When we perform  left rotations, the array undergoes the following sequence of changes:
 */