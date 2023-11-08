package jdk.CodeAssess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] inputString = new String[2];
        int[] inputNumbers = new int [2];

        while((line = br.readLine()) != null) {
            inputString = line.split(" ");
            inputNumbers = strArrayToIntArray(inputString);

            System.out.println(numberOfPrimeNumbers(inputNumbers));
        }
    }

    public static int numberOfPrimeNumbers(int[] numbers){
        int startNumber = 0;
        int endNumber = 0;
        if(numbers[0] <= numbers[1]){
            startNumber = numbers[0];
            endNumber = numbers[1];
        }
        else{
            startNumber = numbers[1];
            endNumber = numbers[0];
        }

        List<Integer> primeNumberList = new ArrayList<>();

        for ( int i = startNumber; i <= endNumber; i++){
            if( i != 1 && isPrimeNumber(i))
                primeNumberList.add(i);
        }

        int count = 0;
        for (int j = 0; j < primeNumberList.size();  j++){
            for( int x = 0; x< primeNumberList.size()-1; x++){
                if(primeNumberList.get(j) == (primeNumberList.get(x)
                                    + primeNumberList.get(x+1) + 1 ))
                    count++;
            }
        }

        return count;
    }

    public static boolean isPrimeNumber (int number){
        for (int i = 3; i < number; i++){
            if(number % 2 == 0 || number % i == 0)
                return false;
        }

        return true;
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

}

/***
 * Prime Numbers
 *
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests number handling ability of candidate.
 * Recommended time for solving this problem:
 * 20 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Loops, For loop, If condition, If else condition, Prime
 * Problem Text:
 * 5/10
 *
 * Write a program that takes L and R as input and displays the number of
 * prime numbers that lie between L and R (L and R inclusive) and can be
 * represented as sum of two consecutive prime numbers + 1.
 *
 * Example:
 *
 * Case 1:
 *
 * For the input provided as follows:
 *
 * 1 20
 *
 * Output of the program will be:
 *
 * 2
 *
 * Explanation
 *
 * 13 is a prime number which can be expressed like 5+7+1.
 * 19 is a prime number which can be expressed like 7+11+1.
 * So output is 2.
 * Note that 5 and 7 are consecutive primes. Similarly 7 and 11 are consecutive primes.
 *
 * Case 2:
 *
 * For the input provided as follows:
 *
 * 1 10
 *
 * Output of the program will be:
 *
 * 0
 *
 * Explanation
 *
 * No prime numbers lie between 1 and 10 that can be represented as sum of
 * two consecutive prime numbers + 1, hence 0 is displayed.
 */