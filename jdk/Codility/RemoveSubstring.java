package jdk.Codility;

public class RemoveSubstring {
    public static void main (String[] args) throws Exception {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int inputNumber = Integer.parseInt(bufferedReader.readLine());

//        String s = "abccac";
        String s = "axaabyab";

        System.out.println(removeSubstring(s));

//        bufferedReader.close();
    }

    public static int removeSubstring(String S) {
        // write your code in Java SE 8
        int min = 0;
        String subString = S;
        String subString1 = removeFirstLetter(subString);

        System.out.println("subString1:" + subString1);

        if(!subString1.equals(S)){
            subString1 = removeFirstLetter(S);
        }
        String subString2 = removeLastLetter(S);
        String subString3 = removeFirstAndLastLetter(S);
        System.out.println("subString1:" + subString1);
        System.out.println("subString2:" + subString2);
        System.out.println("subString2:" + subString3);

        return min;
    }

     static String removeFirstLetter(String S) {
        Character startC = S.charAt(0);
        String subString = S;
        int index = S.indexOf(startC,1);
        System.out.println("start index:" + index);
        if(index > 0){
            subString = S.substring(index + 1,S.length());
        }

        return subString;
    }

    static String removeFirstAndLastLetter(String S) {
        Character startC = S.charAt(0);
        String subString = S;
        int index = S.lastIndexOf(startC);
        System.out.println("last index:" + index);
        if(index > 0){
            subString = S.substring(index + 1, S.length());
        }

        return subString;
    }

     static String removeLastLetter(String S) {
        Character endC = S.charAt(S.length()-1);
        String subString = S;
        int index = S.indexOf(endC);
        System.out.println("end index:" + index);
        if(index > 0){
            subString = S.substring(0,index);
        }

        return subString;
    }

}

/****
 * You are given a string S consisting of N lowercase letters. In one move you can remove any substring (consistent fragment) from S, which starts and ends with the same letter and is at least two letters long. What is the minimum number of letters that may remain in S after any number of such moves?
 *
 * Write a function:
 *
 * class Solution { public int solution(String S); }
 *
 * that, given a string S, returns the length of the shortest string that can be obtained from S by applying any number of moves as described above.
 *
 * Examples:
 *
 * 1. Given S = "abccac", the function should return 1. After removing the substring "abcca", there will be a single letter "c" remaining.
 *
 * 2. Given S = "abcdabcdabcd" ("abcd" stated three times), the function should return 2. To achieve that, you can, for example, remove the first five letters from S ("abcda") in the first move, and the last five letters ("dabcd") in the second move. The remaining fragment would be "bc".
 *
 * 3. Given S = "axaabyab", the function should return 0. It is possible to remove all letters by removing the substring "axaa" in the first move, and then "byab" in the second.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * string S consists only of lowercase letters (a−z).
 */