package Coderbyte;

import java.util.HashMap;
import java.util.Map;

public class FirstFactorial {
    public static void main (String[] args) throws Exception {

//        String[] a = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
//        String[] a = new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        int num = 4;
//        int num = 8;
        System.out.println(findFirstFactorial(num));
    }

    public static int findFirstFactorial(int num) {
        if(num == 1)
            return 1;

        return num * findFirstFactorial(num - 1);
    }

}

/****
 * First Factorial
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 * Examples
 * Input: 4
 * Output: 24
 * Input: 8
 * Output: 40320
 * Tags
 * recursionmath fundamentalsfree
 */