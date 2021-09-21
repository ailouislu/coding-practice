package CodeAssess;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main (String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] letterStrings = new String[50];

        while((line=br.readLine()) != null) {
            String reg = "[^a-zA-Z]";
            String letterString = line.replaceAll(reg, "").trim().toLowerCase();
            letterStrings = letterString.split("");

            System.out.println(isPermutation(letterStrings));

        }
    }

    public static String isPermutation (String[] letterStrings){
        int index = letterStrings.length - 1;
        for (int i = 0; i <= index; i++){
            if(!letterStrings[i].equals(letterStrings[(index - i)]))
                return "NO";

            if(i == (index - i))
                break;
        }

        return "YES";
    }
}

/***
 * Palindrome
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests the knowledge of strings processing and corner case handling skills.
 * Recommended time for solving this problem:
 * 20 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Loops, For loop, While loop, Foreach loop, If condition, If else condition,
 * ToLower, Lowercase Conversion, ToLowerCase, Palindrome
 * Problem Text:
 * Passed
 * Write a program that takes a string as input and prints whether
 * this string is a true palindrome or not. A true palindrome is a string
 * such that if you remove all characters except for letters (uppercase and lowercase),
 * the string is equal if read from left to right and from right to left.
 * If the inputted string is a true palindrome, the message YES (uppercase required)
 * is displayed else NO is displayed.
 *
 * Notice that lowercase letters are equal to uppercase letters and vice-versa.
 *
 * Example
 *
 * Case 1:
 *
 * For input provided as follows:
 *
 * abut-1-tuba
 *
 * Output of the program will be:
 *
 * YES
 *
 * Description:
 *
 * If we remove the bad characters 1 and -, we get the string “abuttuba” which is a palindrome.
 *
 * Case 2:
 *
 * For the input provided as follows:
 *
 * @allula
 *
 * Output of the program will be:
 *
 * NO
 *
 * Description:
 *
 * After removing the bad characters we get “allula” which is not a palindrome.
 */