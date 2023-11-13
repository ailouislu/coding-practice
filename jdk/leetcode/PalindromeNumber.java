package jdk.leetcode;

/***
 * 9. Palindrome Number
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 191;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String input = Integer.toString(x);
        int len = input.length();
        for ( int i = 0; i < len / 2; i ++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
