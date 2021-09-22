package CodeAssess;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReversArray {
    public static void main(String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String[] inputString;

        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }

            inputString = line.split(" ");
            System.out.println(reversaArray(inputString));
            count = 0;
        }
    }

    public static String reversaArray(String[] strings) {
        StringBuilder returnString = new StringBuilder();
        for (int i = strings.length-1; i >= 0 ; i--)
            returnString.append(strings[i]).append(" ");

        return returnString.toString();
    }

}

/***
 * Reverse Array
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests the knowledge of array processing such as reversing an array of integers.
 * Recommended time for solving this problem:
 * 15 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Strings, Arrays, Loops, For loop, While loop, Foreach loop, Do while loop,
 * If condition, If else condition, Logical operations, Logical operators,
 * Type Conversion, Print, Output, Input Output, STDIN STDOUT, Console Read,
 * Console Write, Return Value, Split
 * Problem Text:
 * Passed
 * Write a program that takes an array of size N as input and gives the output
 * as an array in the reverse order. The format of the input is as follow:
 *
 * N
 * a1 a2 a3 a4 a5 … an
 *
 * 'N' is the size of the array and a1, a2, a3, … an, are its elements.
 * Your program should give output (on the same line and separated by a space) as follows:
 *
 * an an-1 an-2 … a1
 *
 * Example
 *
 * Case 1:
 * For input provided as follows:
 *
 * 3
 * 1 2 3
 *
 * Output of the program will be:
 *
 * 3 2 1
 *
 * Description:
 *
 * As the input is 1 2 3, if we reverse these numbers we get: 3 2 1.
 *
 * Case 2:
 *
 * For the input provided as follows:
 *
 * 4
 * 1 2 1 0
 *
 * Output of the program will be:
 *
 * 0 1 2 1
 *
 * Description:
 *
 * The reversed order of the input is 0 1 2 1.
 */