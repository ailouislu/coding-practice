package jdk.Codility;

public class TwoConsecutiveIntegers {
    public static void main (String[] args) throws Exception {

//        int a = 6;
//        int b = 20;
//        int a = 21;
//        int b = 29;
        int a = 50;
        int b = 60;
        System.out.println(findTwoConsecutiveIntegers(a,b));
    }

    public static int findTwoConsecutiveIntegers(int a, int b) {
        int result = 0;
        int n = 0;
        int m = 0;
        for(int i = 3; i <= Math.sqrt(b); i ++){
            n = (i - 1) * i;
            m = i * (i + 1);
            if(n >= a && n <= b && m >= a && m <= b){
                result = i;
                break;
            }
        }

        return result;
    }

}

/****
 We are given a string S consisting of N lowercase letters.
 A sequence of two adjacent letters inside a string is called a digram.
 The distance between two digrams is the distance between the
 first letter of the first digram and the first letter of the second digram.
 For example, in string S = "akcmz" the distance between digrams "kc" and "mz" is 2.
 We want to find the distance between the furthest identical digrams inside string S.
 Write a function:class Solution [public int solution(String S); )that,
 given a string S consisting of N letters, returns the distance
 between the two identical digrams in the string that lie furthest away
 from each other. If there are no two identical digrams inside S,
 your function should return -1.Examples:1. Given S = "aakmaakmakda"
 your function should return 7. The furthest identical digrams are "ak"s,
 starting in positions 2 and 9 (enumerating from 1): "aakmaakmakda".2.
 Given S = "aaa" your function should return 1. The furthest identical digrams are
 "aa"s starting at positions 1 and 2.3. Given S = "codility" your function
 should return-1. There are no two identical digrams in S.Write an efficient
 algorithm for the following assumptions:N is an integer within the
 range [2..300,000];string S consists only of lowercase letters (a-z)
 */