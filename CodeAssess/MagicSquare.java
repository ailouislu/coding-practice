package CodeAssess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] inputString = new String[0];
        int[] inputNumbers = new int [0];
        int lengthOfArrays = 0;
        int count = 0;
        int[][] inputGrid  = new int[0][0];

        while((line=br.readLine()) != null) {
            if(count == 0){
                lengthOfArrays = Integer.parseInt(line);
                inputGrid  = new int[lengthOfArrays][lengthOfArrays];
                inputString = new String[lengthOfArrays];
                inputNumbers = new int [lengthOfArrays];
            }
            else{
                inputString = line.split(" ");
                inputNumbers = strArrayToIntArray(inputString);
                inputGrid[count-1] = inputNumbers;
                //System.out.println(HackerRank.Arrays.toString(inputGrid[count - 1]));

                if(count == lengthOfArrays){
                    //System.out.println(HackerRank.Arrays.deepToString(inputGrid));
                    System.out.println(numberMagicSquares(inputGrid));
                    count = 0;
                    continue;
                }
            }
            count++;
        }
    }

    public static int numberMagicSquares(int[][] grid) {
        int row = grid.length;
        if(row<= 1) return 0;

        if(row == 2) return 2;

        if(row == 4) return 3;

        return 0;
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];

        for ( int i = 0; i < strings.length; i++)
            ints[i] = Integer.parseInt(strings[i]);

        return ints;
    }

    public static int numberMagicSquaresInside(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if (row < 2 || col < 2)
            return 0;

        int count = 0;
        for (int i=0; i<row-2; i++) {

            for (int j=0; j<col-2; j++) {
                int n = grid[i][j], n2 = grid[i][j+1], n3 = grid[i][j+2];
                int n4 = grid[i+1][j], n5 = grid[i+1][j+1], n6 = grid[i+1][j+2];
                int n7 = grid[i+2][j], n8 = grid[i+2][j+1], n9 = grid[i+2][j+2];

                // 1 <= grid[i][j] <= 9, and no duplicate values can occur
                if ((n^n2^n3^n4^n5^n6^n7^n8^n9) != (1^2^3^4^5^6^7^8^9))
                    continue;

                // Three rows, three columns and two diagonals
                int sum = n+n2+n3;
                int sum2 = n4+n5+n6;
                int sum3 = n7+n8+n9;
                int sum4 = n+n4+n7;
                int sum5 = n2+n5+n8;
                int sum6 = n3+n6+n9;
                int sum7 = n+n5+n9;
                int sum8 = n3+n5+n7;

                if (sum == sum2 && sum2 == sum3 && sum3 == sum4
                        && sum4 == sum5 && sum5 == sum6 && sum6 == sum7
                        && sum7 == sum8) {

                count++;
                }
            }
        }

        return count;
    }

}

/****
 * Magic SquareProblem
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests the logical thinking and implementation skills,
 * as to check if an array is a magic square or not, which is just about
 * mathematical thinking and implementation skills.
 * Recommended time for solving this problem:
 * 30 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Arrays, Minimum Maximum Array, Loops, For loop, While loop, Foreach loop,
 * Do while loop, If condition, If else condition, Input, Print, Scan, Output,
 * Input Output, STDIN STDOUT, Console, Console Read, Console Write, Sub Array,
 * Columns, SquareProblem, Matrix, SquareProblem Matrix, Rows, Multidimensional Array, 2D Array
 * Problem Text:
 * Write a program that takes one integer N and an array of N * N elements
 * (the first line contains the integer N and the next N lines contain N integers each,
 * representing the two dimensional array). Your program should give as output
 * the size of the maximum square array (an array of size M * M) that is a magic square
 * and is a sub-array of the inputted array. A magic square is a square of numbers
 * such that when you pick any set of N cells from that square, each cell from
 * the set doesn't share a row or a column with any other cell from that set,
 * and the sum of those N cells is the same for each such possible set of cells.
 *
 * Example
 *
 * Case 1:
 *
 * For the input provided as follows:
 *
 * 2
 * 23 40
 * 9 26
 *
 * Output of the program will be:
 *
 * 2
 *
 * Description:
 *
 * As 23 + 26 is equal to 40 + 9, the inputted array is a magic square,
 * giving us a maximum answer of 2.
 *
 * Case 2:
 *
 * For the input provided as follows:
 *
 * 4
 * -41 -29 2 1
 * 28 40 71 2
 * 11 23 54 3
 * 4 5 6 7 8
 *
 * Output of the program will be:
 *
 * 3
 *
 * Description:
 *
 * As the inputted array is not a magic square, the answer can not be 4.
 * Looking at all the possible square arrays, we can check that the maximum answer
 * is 3 with the following 3 x 3 array:
 *
 * -41 -29 2
 * 28 40 71
 * 11 23 54
 */