package CodeAssess;

import java.io.*;

public class SquareProblem {
    public static void main (String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int input = 0;

        while((line=br.readLine()) != null) {
            input = Integer.parseInt(line);

            System.out.println(input * input);
        }

    }
}

/***
 * SquareProblem Problem
 * Problem Level: EasyMediumHard
 * Problem Description:
 * Print square of inputted integer
 * Recommended time for solving this problem:
 * 15 minutes
 * Problem Text:
 * Passed
 * Write a program to print the square of an inputted integer.
 *
 * For example,
 *
 * For the input provided as follows to the program:
 *
 * 3
 *
 * The output of the program will be:
 *
 * 9
 */